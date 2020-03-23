package thread.synchronizedpack;

public class SynchronizedDemo1 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (ticket > 0){
            try {
                Thread.sleep(10);
                System.out.println(Thread.currentThread().getName()+"买第"+ticket+"张票");
                ticket--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
