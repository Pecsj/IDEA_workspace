package thread.waitnotify;

/**
 * 包子铺生产包子到包子铺
 */
public class Baozipu extends Thread {
    private Baozi baozi = null;

    public Baozipu(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while(true){
            synchronized(baozi){
                if(baozi.flage == true){
                    //如果有包子，唤醒线程吃包子,并阻塞当前线程
                    baozi.notify();
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    //没有包子做包子
                    try {
                        Thread.sleep(3000);
                        baozi.flage = true;
                        baozi.type = Type.getRandomType();
                        System.out.println("做了一个"+baozi.type.getName()+"包子");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
