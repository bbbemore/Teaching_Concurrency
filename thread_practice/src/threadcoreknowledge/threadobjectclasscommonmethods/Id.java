package threadcoreknowledge.threadobjectclasscommonmethods;

/**
 * ID从1开始(源码是++threadSeqNumber)
 * JVM运行起来后，我们自己创建的线程的ID早已不是0。
 * @author Bmo
 * @date 2020/2/27 10:09
 */
public class Id {
    public static void main(String[] args) {
        Thread thread = new Thread();
        System.out.println("主线程ID" + Thread.currentThread().getId());
        System.out.println("子线程ID" + thread.getId());
    }
}
