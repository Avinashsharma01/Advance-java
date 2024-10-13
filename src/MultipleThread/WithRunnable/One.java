package MultipleThread.WithRunnable;

public class One implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {

            System.out.println("Hello"+ Thread.currentThread().threadId());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
