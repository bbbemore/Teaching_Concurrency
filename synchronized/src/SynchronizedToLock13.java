import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Bmo
 * @date 2020/2/16 15:02
 */
public class SynchronizedToLock13 {
    Lock lock = new ReentrantLock();

    public synchronized void method1() {
        System.out.println("我是synchronized修饰的锁");
    }

    public void method2() {
        lock.lock();
        try {
            System.out.println("我是lock形式的锁");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        SynchronizedToLock13 s = new SynchronizedToLock13();
        s.method1();
        s.method2();
    }
}
