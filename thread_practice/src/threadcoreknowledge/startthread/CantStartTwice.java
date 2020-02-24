package threadcoreknowledge.startthread;

/**
 * 演示不能两次调用start方法，否则会报错
 * @author Bmo
 * @date 2020/2/24 9:26
 */
public class CantStartTwice {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        thread.start();
    }
}
