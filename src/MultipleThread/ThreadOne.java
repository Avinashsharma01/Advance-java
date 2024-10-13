package MultipleThread;

public class ThreadOne extends Thread {
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Thread-1 "+i);
        }
    }
}
