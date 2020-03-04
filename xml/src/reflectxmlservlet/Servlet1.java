package reflectxmlservlet;

public class Servlet1 implements Myserlvlet{
    @Override
    public void init() {
        System.out.println("s1.init()");
    }

    @Override
    public void execute() {
        System.out.println("s1.execute()");
    }

    @Override
    public void close() {
        System.out.println("s1.close()");
    }
}
