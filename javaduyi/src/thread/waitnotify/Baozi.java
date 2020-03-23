package thread.waitnotify;

/**
 * 包子实体类
 */
public class Baozi {
    public boolean flage = false;
    public Type type = null;

    public void Baozi(){}
    public void Baozi(boolean flage,Type type){
        this.flage = flage;
        this.type = type;
    }

}
