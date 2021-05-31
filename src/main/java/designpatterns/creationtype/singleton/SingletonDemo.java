package   designpatterns.creationtype.singleton;

/**
 * @author: Samuel
 * @date: 2021-05-13 12:42
 * 单例设计模式：
 *      重点是保证其中只有一个实例
 *      关键在于将构造方法私有化并提供对应的实例获取方法
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Mgr01 m1=Mgr01.getInstance();
        Mgr01 m11=Mgr01.getInstance();
        System.out.println(m1==m11);
        Mgr02 m2=Mgr02.getInstance();
        Mgr02_ m22=Mgr02_.getInstance();
        Mgr02__ m222=Mgr02__.getInstance();
        Mgr03 m3=Mgr03.getInstance();
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mgr04.INSTANCE.hashCode());
            }).start();
        }

    }
}
