package MultipleThread.WithRunnable;

public class Three implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hey" + Thread.currentThread().threadId());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
