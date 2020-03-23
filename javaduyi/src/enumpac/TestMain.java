package enumpac;

import enumpac.Type;

public class TestMain {

    public static void main(String[] args) {
        Type t = Type.valueOf("SANXIAN");
        System.out.println(t.getName());
    }

}
