package thread.waitnotify;

/**
 * 客户吃包子
 */
public class Client extends Thread{
    private Baozi baozi = null;

    public Client(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (baozi){
                if (baozi.flage == false){
                    //没有包子等待包子铺唤醒
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    //被包子铺唤醒有包子，吃包子
                    try {
                        Thread.sleep(1000);
                        System.out.println(Thread.currentThread().getName()+"吃了个"+baozi.type.getName()+"馅的包子");
                        baozi.flage = false;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        //吃完包子唤醒包子铺做包子
                        baozi.notify();
                    }
                }
            }
        }
    }
}
