package   designpatterns.creationtype.singleton;

/**
 * @author: Samuel
 * @date: 2021-05-13 14:03
 * 完美的单例实现之一
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 *
 */
public class Mgr03 {
    private Mgr03(){}

    private static class Mgr03Holder{
        private static final Mgr03 INSTANCE=new Mgr03();
    }

    public static Mgr03 getInstance(){
        return Mgr03Holder.INSTANCE;
    }
}
