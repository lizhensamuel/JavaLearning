package   reflection;

import java.lang.reflect.*;
import java.security.spec.RSAOtherPrimeInfo;

//获得类信息
public class ClassInfo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Person person=new Person("敲里吗",23,33);
        Class aClass=person.getClass();

        //获得类的父类信息
        aClass.getSuperclass();//Object父类为null,除了Object以外的非接口的类都有父类
        Class[] is=aClass.getInterfaces();//获取接口信息
        for(Class c:is){
            System.out.println(c);
        }

        //判断向上转型是否成立
        System.out.println(Integer.class.isAssignableFrom(Integer.class));
        System.out.println(Integer.class.isAssignableFrom(Number.class));
        System.out.println(Integer.class.isAssignableFrom(Object.class));
        System.out.println(Integer.class.isAssignableFrom(Double.class));
        System.out.println(Number.class.isAssignableFrom(Integer.class));


        //获得类的名字
        System.out.println(aClass.getName());//包命+类名
        System.out.println(aClass.getSimpleName());//类名

        System.out.println("===============");

        //获得类的属性
        Field[] fields=aClass.getFields();//只能找到public属性(包括继承至父类的)
        fields=aClass.getDeclaredFields();//找到当前类的全部属性
        for(Field field:fields){
            System.out.println(field);
            System.out.println(field.getName());//获得名称信息
            System.out.println(field.getType());//获得类型信息
            int modifiers=field.getModifiers();
            System.out.println("is Final:"+Modifier.isFinal(modifiers));
            System.out.println("is Public:"+Modifier.isPublic(modifiers));
            System.out.println("is Protected:"+Modifier.isProtected(modifiers));
            System.out.println("is Private:"+Modifier.isPrivate(modifiers));
            System.out.println("is Static:"+Modifier.isStatic(modifiers));

        }

        //获得指定的属性的值
        Field name=aClass.getDeclaredField("name");
        name.setAccessible(true);//不论是否是public字段,一律允许访问
        name.set(person,"23333");//修改指定字段的值
        Object o=name.get(person);
        System.out.println(o);

        System.out.println("==============");

        //获得方法
        Method[] method=aClass.getMethods();//获得本类及继承父类的全部public方法
        for(Method method1:method){
            System.out.println("getMethods:"+method1);
        }
        method=aClass.getDeclaredMethods();//获得本类的所有方法
        for(Method method1:method){
            System.out.println("getDeclaredMethods:"+method1);
        }

        //获得指定的方法
        Method getName=aClass.getMethod("getName",null);
        Method setName=aClass.getMethod("setName",String.class);
        getName.getName();//获取方法名
        getName.getReturnType();//获取方法名返回类型
        getName.getParameterTypes();//获取方法参数类型
        getName.getModifiers();//获取方法修饰符
        getName.invoke(person);//调用获取的方法
        getName.setAccessible(true);//允许调用非public方法,可能会失败



        System.out.println("==============");

        //获得构造器
        Constructor[] constructor=aClass.getConstructors();//public
        Constructor[] constructor2=aClass.getDeclaredConstructors();//全部
        for(Constructor constructor1:constructor){
            System.out.println("getConstructors:"+constructor1);
        }
        for(Constructor constructor1:constructor2){
            System.out.println("getDeclaredConstructors:"+constructor1);
        }

        //获得指定构造器
        Constructor constructor0=aClass.getConstructor(String.class,int.class,int.class);
        System.out.println("指定构造器:"+constructor0);
        constructor0.newInstance("2333",2333,2333);//反射调用构造器



    }
}
