package   oop;

public class InnerClass {
    public static void main(String[] args) {
        Outer outer=new Outer();
        //通过外部类来实例化成员内部类内部类
        Outer.Inner inner = outer.new Inner();
        inner.print();
        inner.getID();
        inner.getOuterPrint();
    }
}
