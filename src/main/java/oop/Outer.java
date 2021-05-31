package   oop;

public class Outer {
    private int id;
    public void print(){
        System.out.println("这是外部类的方法");
    }

    public void method(){
        //局部内部类，定义在方法内，作用域仅限于该方法
        class LocalInner{
            public void method(){
                System.out.println("局部内部类");
            }
        }
    }

    public class Inner{
        public void print(){
            System.out.println("这是内部类的方法");
        }

        //内部类可以获得外部类的私有属性和方法
        public void getID(){
            System.out.println(id);
        }

        public void getOuterPrint(){
            Outer.this.print();
        }
    }

    //静态内部类
    public static class StaticInner{

    }

    public static void main(String[] args) {
        //匿名内部类：没有名字的初始化类，不用将实例保存至变量中
        new AnonymousInner().run();
        //可以new一个接口
        new Interface() {

            @Override
            public void run() {

            }
        };
    }
}

class AnonymousInner{
    public void run(){
        System.out.println("匿名内部类中的方法");
    }
}

interface Interface{
    void run();
}


