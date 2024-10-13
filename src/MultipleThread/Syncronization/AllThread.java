package MultipleThread.Syncronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AllThread {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        ThreadOne thread1 = new ThreadOne(lock, 1);
        ThreadTwo thread2 = new ThreadTwo(lock, 2);
        ThreadThree thread3 = new ThreadThree(lock, 3);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("multiple threading is over");
    }
}