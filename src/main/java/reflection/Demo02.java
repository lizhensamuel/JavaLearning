package   reflection;
//测试类什么时候会初始化
public class Demo02 {
    static{
        System.out.println("Main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //1.主动引用
        //Son son=new Son();
        //反射也会产生主动引用
        //Class.forName("www.reflection.Son");

        System.out.println("==============");

        //不会产生类的引用的方法
        //System.out.println(Son.b);//通过子类访问父类的静态变量
        //Son[] array=new Son[10];//通过数组定义类引用
        System.out.println(Son.M);//引用常量
    }
}

class Father{
    static int b=2;

    static{
        System.out.println("父类被加载");
    }
}

class Son extends Father{
    static{
        System.out.println("子类被加载");
        m=300;
    }

    static int m=100;
    static final int M=1;
}
