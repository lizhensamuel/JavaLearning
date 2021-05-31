package designpatterns.structuretype.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * @author: Samuel
 * @date: 2021-05-17 16:58
 * cglib->CodeGenerateLibrary
 * CGLIB实现动态代理不需要接口
 */
public class Main {
    public static void main(String[] args) {
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new TimeMethodInterceptor());
        Tank tank=(Tank)enhancer.create();
        tank.move();
    }
}

class TimeMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println(obj.getClass().getSuperclass().getName());
        System.out.println("before");
        Object result=null;
        result=proxy.invokeSuper(obj,args);
        System.out.println("after");
        return result;
    }
}

class Tank{
    public void move(){
        System.out.println("Tank moving...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



