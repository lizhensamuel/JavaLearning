package   designpatterns.creationtype.singleton;

/**
 * @author: Samuel
 * @date: 2021-05-13 12:59
 * lazy loading
 * 懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 *
 */
public class Mgr02 {
    private static Mgr02 INSTANCE;

    private Mgr02(){}

    public static Mgr02 getInstance(){
        if(INSTANCE==null){
            INSTANCE=new Mgr02();
        }
        return INSTANCE;
    }
}

class Mgr02_{
    //改进一：将整个方法上锁
    //能确保线程安全，但效率下降
    private static Mgr02_ INSTANCE;

    private Mgr02_(){}

    public static synchronized Mgr02_ getInstance(){
        if(INSTANCE==null){
            INSTANCE = new Mgr02_();
        }
        return INSTANCE;
    }
}

class Mgr02__{
    //改进二：只锁关键语句并使用双重检查
    //确保线程安全的同时能提高一点效率
    private static volatile Mgr02__ INSTANCE;

    private Mgr02__(){}

    public static Mgr02__ getInstance(){
        //双重检查
        if(INSTANCE==null){
            synchronized (Mgr02__.class){
                if(INSTANCE==null){
                    INSTANCE=new Mgr02__();
                }
            }
        }
    return INSTANCE;
    }
}
