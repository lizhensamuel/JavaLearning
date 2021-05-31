package   oop;
/*
    抽象类：用以实现约束作用
 */
public abstract class Abstract {
    //抽象方法必须要在抽象类中
    public abstract void doSomething();//抽象类中的抽象方法

    //抽象类中可以有普通方法
    public void print(){
        System.out.println("print");
    }
}

