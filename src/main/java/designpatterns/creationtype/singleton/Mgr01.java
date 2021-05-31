package   designpatterns.creationtype.singleton;

/**
 * @author: Samuel
 * @date: 2021-05-13 12:48
 *
 * 饿汉式：
 *  类加载到内存后，就实例化一个单例，JVM保证线程安全
 *  简单实用，推荐使用
 *  唯一缺点：不管你用不用，类装载时就完成了实例化（事实上你不用的话也不会去装载这个类）
 *
 *  实际上最常用的一种写法
 *
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE =new Mgr01();

    private Mgr01(){};

    public static Mgr01 getInstance(){return INSTANCE;}
}
