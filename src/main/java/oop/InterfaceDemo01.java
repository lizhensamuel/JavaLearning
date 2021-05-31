package   oop;

public interface InterfaceDemo01 {
    //接口中定义的量一定是常量且一定是public static final修饰的
    public static final int NUM=0;
    //public static final修饰符可以不写
    int NUM2=0;

    //接口中定义的方法都是用public abstract修饰的抽象方法
    public abstract void add(String name);
    //public abstract修饰符可以不写
    void delete(String name);
    void update(String name);
    void query(String name);
}
