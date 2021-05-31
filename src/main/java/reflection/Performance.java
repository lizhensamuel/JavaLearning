package   reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//性能分析
public class Performance {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test01();
        test02();
        test03();
    }

    //普通方式调用方法
    public static void test01(){
        Test test=new Test();

        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            test.getName();
        }
        long endTime=System.currentTimeMillis();

        System.out.println("普通方式调用方法花费："+(endTime-startTime)+"ms");
    }


    //反射方式调用方法
    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Test test02 =new Test();
        Method method= test02.getClass().getDeclaredMethod("getName");

        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            method.invoke(test02);
        }
        long endTime=System.currentTimeMillis();

        System.out.println("反射方式调用方法花费："+(endTime-startTime)+"ms");
    }

    //关闭访问安全检测后的反射方式调用方法
    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Test test03=new Test();
        Method method=test03.getClass().getDeclaredMethod("getName");
        method.setAccessible(true);

        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            method.invoke(test03);
        }
        long endTime=System.currentTimeMillis();

        System.out.println("关闭访问安全检测后反射方式调用方法花费："+(endTime-startTime)+"ms");
    }



}

class Test{
    private String name;

    public Test(){

    }

    public Test(String name){
        this.name=name;
    }

    public void setName(String name){

    }

    public String getName(){
        return this.name;
    }

}
