package thread.synchronizedpack;

public class TestMain {
    public static void main(String[] args) {
        SynchronizedDemo3 syn = new SynchronizedDemo3();
        System.out.println(syn);

        Thread t1 = new Thread(syn);
        Thread t2 = new Thread(syn);
        Thread t3 = new Thread(syn);

        t1.start();
        t2.start();
        t3.start();

    }

}
