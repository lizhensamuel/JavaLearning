package   designpatterns.behaviourtype.strategy;

/**
 * @author: Samuel
 * @date: 2021-05-13 15:09
 *
 * 通过该接口定义用于比较的接口
 * 接口中定义用于比较的方法
 */
public interface MyComparable<T> {
    int compareTo(T t);
}
