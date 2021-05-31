package   designpatterns.creationtype.singleton;

/**
 * @author: Samuel
 * @date: 2021-05-13 14:09
 * Java创始人的一种写法
 * 语法上最完美的
 * 不仅可以解决线程同步问题，还可以防止反序列化
 */
public enum Mgr04 {
    INSTANCE;
}
