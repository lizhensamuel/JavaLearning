package   annotation;

import java.lang.annotation.*;

@MyAnnotation()
public class Demo {

    //注解可以显式赋值，如果没有默认值，我们就必须给注解赋值
    //注解的参数没有顺序
    @MyAnnotation(name = "samuel",age = 3,id = 3)
    @MyAnnotation2("samuel")
    public void run(){

    }
}

/**
 * @author Samuel
 */ //自定义注解
@Target(value = {ElementType.METHOD,ElementType.TYPE})//表示注解的使用范围
@Retention(value = RetentionPolicy.RUNTIME)//表示注解的有效范围（runtime>class>source）
@Documented//表示是否将注解生成在JavaDoc中
@Inherited//表示子类可以继承父类的注解
@interface MyAnnotation{
    //注解的参数：参数类型+参数名();
    String name() default "";
    int age() default 0;
    int id() default -1;//默认值为-1表示不存在

}

/**
 * @author Samuel
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface  MyAnnotation2{
    String value();//当只有一个参数时命名为value，这样使用的适合可以直接填值不用value=...
}
