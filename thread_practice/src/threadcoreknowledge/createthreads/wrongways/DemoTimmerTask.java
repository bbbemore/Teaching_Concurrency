package threadcoreknowledge.createthreads.wrongways;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器创建线程
 * @author Bmo
 * @date 2020/2/21 11:21
 */
public class DemoTimmerTask {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }, 1000, 1000);
    }
}
