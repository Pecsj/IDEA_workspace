package enumpac;

public enum Type {
    SANXIAN("三鲜",1),NIUROU("牛肉",2),JIUCAI("韭菜",3);

    private String name;
    private int index;

    private Type(){}
    private Type(String name,int index){
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
