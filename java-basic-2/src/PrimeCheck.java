import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimeCheck {
    
    // 素数判定
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
    
    // 下一桁の抽出
    static int getLastDigit(int n) {
        return n % 10;
    }

    public static void main(String[] args) {
        // 素数のリストを保持するMap (キー: 下一桁, 値: 素数のリスト)
        Map<Integer, List<Integer>> primeGroups = new HashMap<>();
        
        // 連続する素数の下一桁の出現回数を保持するMap (キー: 下一桁のペア, 値: 出現回数)
        Map<String, Integer> digitPairCount = new HashMap<>();
        
        for (int i = 3; i <= 100000; i++) {
            if (isPrime(i)) {
                int lastDigit = getLastDigit(i);
                
                // 素数グループの分類
                List<Integer> primes = primeGroups.getOrDefault(lastDigit, new ArrayList<>());
                primes.add(i);
                primeGroups.put(lastDigit, primes);
                
                // 下一桁のペアの出現回数の計算
                for (int j = 1; j <= 9; j += 2) {
                    if (j != lastDigit && isPrime(i - lastDigit + j)) {
                        String pair = lastDigit + "-" + j;
                        digitPairCount.put(pair, digitPairCount.getOrDefault(pair, 0) + 1);
                    }
                }
            }
        }
        
        // 素数グループの出力
        for (Map.Entry<Integer, List<Integer>> entry : primeGroups.entrySet()) {
            System.out.println("下一桁: " + entry.getKey() + ", 素数: " + entry.getValue());
        }
        
        // 下一桁のペアの出現回数のランキング付け
        List<Map.Entry<String, Integer>> sortedPairs = new ArrayList<>(digitPairCount.entrySet());
        sortedPairs.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        System.out.println("\n下一桁のペアの出現回数のランキング:");
        for (Map.Entry<String, Integer> entry : sortedPairs) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
