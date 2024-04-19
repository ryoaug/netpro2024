
// C言語では、#include に相当する
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowOldAreYou {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader というのは、データ読み込みのクラス(型)
        // クラスの変数を作るには、new を使う。

        // readLine() は、入出力エラーの可能性がある。エラー処理がないとコンパイルできない。
        // Java では、 try{ XXXXXXXX } catch(エラーの型 変数) { XXXXXXXXXXXXXXXXXX} と書く
        while (true) {
            try {
                System.out.println("何歳ですか? (終了するには 'q' または 'e' を入力してください)");
                String line = reader.readLine();
                if (line.equals("q") || line.equals("e")) {
                    System.out.println("プログラムを終了します。");
                    break;
                }
                int age = Integer.parseInt(line);
                // System.out.println("何歳ですか?");
                // String line = reader.readLine();
                // int age = Integer.parseInt(line);
                System.out.println("あなたは" + age + "歳ですね。");
                if(age >= 120 || age < 0){
                    System.out.println("もう一度入力してください");
                }
                System.out.println("あなたは2030年の年齢は" + (age + 6) + "歳ですね。");
                if (age <= 5) {
                    System.out.println("令和" + (6 - age) + "年");
                }else if(age >= 6 && age >= 35){
                    System.out.println("平成" + (36 - age) + "年");
                } else if (age >= 36 && age <= 98) {
                    System.out.println("昭和" + (99 - age) + "年");
                } else if (age >= 99 && age <= 112) {
                    System.out.println("大正" + (113 - age) + "年");
                } else if (age >= 113 && age <= 119) {
                    System.out.println("明治" + (157 - age) + "年");
                }
            } catch (IOException e) {
                System.out.println(e);
            }

        }
    }
}