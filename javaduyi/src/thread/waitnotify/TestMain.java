package thread.waitnotify;

public class TestMain {
    public static void main(String[] args) {
        //测试同步线程
        Baozi baozi = new Baozi();//包子对象作为对象锁

        Baozipu baozipu = new Baozipu(baozi);
        Client c1 = new Client(baozi);
        c1.setName("常胜杰");

        //开工
        baozipu.start();
        c1.start();
    }


}
