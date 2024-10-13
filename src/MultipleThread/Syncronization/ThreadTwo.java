package MultipleThread.Syncronization;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTwo extends Thread {
    final private Lock lock;
    final private int threadNumber;

    public ThreadTwo(Lock lock, int threadNumber) {
        this.lock = lock;
        this.threadNumber = threadNumber;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            lock.lock();
            try {
                System.out.println("Thread-" + threadNumber + " " + i);
            } finally {
                lock.unlock();
            }
        }
    }
}