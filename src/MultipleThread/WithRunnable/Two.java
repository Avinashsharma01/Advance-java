package MultipleThread.WithRunnable;

public class Two implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi" + Thread.currentThread().threadId());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
