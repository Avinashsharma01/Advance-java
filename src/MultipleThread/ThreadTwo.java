package MultipleThread;

public class ThreadTwo extends Thread {
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Thread-2 "+i);
        }
    }
}
