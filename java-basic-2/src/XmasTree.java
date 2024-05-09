public class XmasTree {

    public static void main(String[] args) {
        int N=10;
        for (int j = 0; j < N; j++) {

            for (int i = 0; i <= N-j; i++) {
                System.out.print(",");
            }

            for (int i = 0; i <= j*2; i++) {
                System.out.print("*");
            }

            for (int i = 0; i <= N-j; i++) {
                System.out.print(",");
            }

            System.out.print("\n");
        }
        int M = 8; //幹の長さ
        int n = N*2;
        for(int j = 0; j < M; j++){

            for(int i = 0; i < n - (n/3)*2; i++){
                System.out.print(" ");
            }

            for(int i = n - (n/3)*2; i < n - (n/3); i++){
                System.out.print("*");
            }

            for(int i = n - (n/3); i <= n ; i++){
                System.out.print("");
            }
            System.out.print("\n");
        }
    }
}
        
        //System.out.println("---------");
        
        /*
        while(i<10) {
            Scanner scan = new Scanner(System.in);

            String str = scan.next();
            //System.out.println("最初のトークンは: " + str);
            //System.out.println("文字を分割すると・・・");
            String[] word = str.split(",");//splitメソッドの引数に、どこの文字で分割するか指定します。この場合は空白文字。
            for(String w:word) {
                System.out.println(w);
            }
            System.out.println("word[0]"+word[0]);
            System.out.println("word[1]"+word[1]);
            System.out.println("word[2]"+word[2]);
            System.out.println("word[3]"+word[3]);
            //19,3,7,c
            //first = Integer.parseInt(str);
            System.out.println("----次の数字の入力をお願いします ");
        }
        /*System.out.println("---------");

        System.out.print("*");
        System.out.println("\n");

        System.out.println("---------");*/

        /*Scanner scan = new Scanner(System.in);  // Scannerオブジェクトを作成
        System.out.println("ツリーの横幅、幹の幅、幹の長さをコンマ区切りで入力してください（例: 19,3,7）:");

        // ユーザーからの入力を読み取る
        String str = scan.next();
        String[] word = str.split(",");

        // 入力が正しいかどうかの確認
        if (word.length != 3) {
            System.out.println("入力が不正です。正しく3つの数値をコンマ区切りで入力してください。");
            scan.close();
            return;
        }

        int treeWidth = Integer.parseInt(word[0]);
        int trunkWidth = Integer.parseInt(word[1]);
        int trunkHeight = Integer.parseInt(word[2]);

        // ツリーの部分を描画
        for (int i = 0; i < treeWidth; i++) {
            for (int j = 0; j < treeWidth - i; j++) {
                System.out.print(" ");  // 空白を出力
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");  // 星を出力
            }
            System.out.println();  // 新しい行に移動
        }

        // ツリーの幹を描画
        int trunkCenter = treeWidth / 2;
        int trunkLeft = trunkCenter - trunkWidth / 2;
        for (int i = 0; i < trunkHeight; i++) {
            for (int j = 0; j < trunkLeft; j++) {
                System.out.print(" ");  // 空白を出力
            }
            for (int j = 0; j < trunkWidth; j++) {
                System.out.print("*");  // 幹の部分を出力
            }
            System.out.println();  // 新しい行に移動
        }
        // Scannerを閉じる
        scan.close();
    }*/










