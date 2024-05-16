import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.BindException;
import java.net.Socket; //ネットワーク関連のパッケージを利用する
import java.util.Scanner;

public class ReserveSystemClient {

    public static void main(String arg[]) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("ポートを入力してください(5000など) → ");
            int port = scanner.nextInt();
            System.out.println("localhostの" + port + "番ポートに接続を要求します");
            Socket socket = new Socket("localhost", port);
            System.out.println("接続されました");

            System.out.println("希望の予約日時を入力してください(例:0517)");
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            //System.out.println("");
            int date = scanner.nextInt();
            System.out.println("何人ですか？(例:3)");
            int count = scanner.nextInt();
            scanner.close();

            ReserveSystem reserve = new ReserveSystem();
            reserve.setDate(date);
            reserve.setCount(count);

            oos.writeObject(reserve);
            oos.flush();

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            ReserveSystem okaeshiPresent = (ReserveSystem) ois.readObject();

            int replayRe = okaeshiPresent.getCount();
            System.out.println("承知しました。" + replayRe + "人で予約します。");
            /*int replayContent = okaeshiPresent.getCount();
            System.out.println(replayContent + "をもらいました！");*/

            ois.close();
            oos.close();
            socket.close();

        } // エラーが発生したらエラーメッセージを表示してプログラムを終了する
        catch (BindException be) {
            be.printStackTrace();
            System.err.println("ポート番号が不正か、サーバが起動していません");
            System.err.println("サーバが起動しているか確認してください");
            System.err.println("別のポート番号を指定してください(6000など)");
        } catch (Exception e) {
            System.err.println("エラーが発生したのでプログラムを終了します");
            throw new RuntimeException(e);
        }
    }
}

