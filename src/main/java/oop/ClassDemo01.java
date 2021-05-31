package   oop;

public class ClassDemo01 {
    public static void main(String[] args) {
        //类：是抽象的，需要对其进行实例化
        //类实例化后会返回一个自己的对象
        ClassDemo001 demo001=new ClassDemo001();
    }
}

class ClassDemo001{
    boolean a;
    int i;
    //一个类中即使什么都不写也一定会有一个默认的构造器
    public ClassDemo001(){

    }
    //当定义了有参构造器后必须再显式地定义一个空构造器
    public ClassDemo001(int i){
        this.i=i;
    }

    public void print(){

        System.out.println("敲里吗");
    }
    
}
