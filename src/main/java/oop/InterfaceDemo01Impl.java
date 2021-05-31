package   oop;
//抽象类通过extends来继承
//接口通过implements来实现
//通过接口可实现多继承
public class InterfaceDemo01Impl implements InterfaceDemo01,InterfaceDemo02{

    //实现了接口的类就必须重写接口中的方法
    @Override
    public void add(String name) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void update(String name) {

    }

    @Override
    public void query(String name) {

    }

    @Override
    public void close() {

    }
}
