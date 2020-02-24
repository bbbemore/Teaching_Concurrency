package threadcoreknowledge.stopthreads;

/**
 * 如果while里面放try/catch，会导致中断失效
 * @author Bmo
 * @date 2020/2/24 10:39
 */
public class CantInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            int num = 0;
            while (num <= 10000) {
                if (num % 100 == 0 && !Thread.currentThread().isInterrupted()) {
                    System.out.println(num + "是100的倍数");
                }
                num++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(500);
        thread.interrupt();
    }
}
