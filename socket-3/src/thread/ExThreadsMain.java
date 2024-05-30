package thread;

public class ExThreadsMain implements Runnable {
    private String threadName;

    public ExThreadsMain(String threadName) {
        this.threadName = threadName;
    }

    public static void main(String[] args) {
        // 5つのスレッドを作成して開始します。
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new ExThreadsMain("Thread-" + (i + 1)));
            threads[i].start();
        }
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(threadName + " adding " + i + ", current sum=" + sum);
            try {
                Thread.sleep(100);  // 各加算後に少しスリープ
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
        System.out.println(threadName + " final sum=" + sum);
    }
}
