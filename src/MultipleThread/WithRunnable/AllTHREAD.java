package MultipleThread.WithRunnable;

public class AllTHREAD {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){  // Loop to run the threads 5 times

            One one = new One();  // Creating object of class One
            Two two = new Two();  // Creating object of class Two
            Three three = new Three();   // Creating object of class Three

            Thread t1 = new Thread(one);  // Creating thread t1 and passing object of class One
            Thread t2 = new Thread(two);  // Creating thread t2 and passing object of class Two
            Thread t3 = new Thread(three);// Creating thread t3 and passing object of class Three

            t1.start();
            t2.start();
            t3.start();
        }
    }
}
