package MultipleThread;

public class ThreadThree extends Thread {
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Thread-3 "+i);
        }
    }
}
