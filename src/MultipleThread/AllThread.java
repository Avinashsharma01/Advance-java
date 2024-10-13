package MultipleThread;

public class AllThread {
    public static void main(String[] args) {
        ThreadOne thread1 = new ThreadOne();
        ThreadTwo thread2 = new ThreadTwo();
        ThreadThree thread3 = new ThreadThree();
        


        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread3.setPriority(Thread.NORM_PRIORITY);


        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("multiple threading is over");
    }
}
