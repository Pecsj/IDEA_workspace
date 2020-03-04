package reflectxmlservlet;

public class Servlet2 implements Myserlvlet{
    @Override
    public void init() {
        System.out.println("s2.init()");
    }

    @Override
    public void execute() {
        System.out.println("s2.execute()");
    }

    @Override
    public void close() {
        System.out.println("s2.close()");
    }
}
