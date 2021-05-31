package   designpatterns.behaviourtype.strategy;

/**
 * @author: Samuel
 * @date: 2021-05-13 14:40
 *
 * 通过使用用于比较的接口，将能对所有实现了用于比较的接口的类进行比较
 * 不同类的不同比较方法由各自实现的compareTo（）实现
 *
 * 对修改关闭，对扩展开放
 */
public class Sorter<T> {
    public void sort(T[] arr, MyComparator<T> myComparator){
        for (int i = 0; i <arr.length-1; i++) {
            int minPos=i;

            for (int j =i+1; j <arr.length ; j++) {
                minPos= myComparator.compare(arr[j],arr[minPos])==-1?j:minPos;
            }
            swap(arr,i,minPos);
        }
    }
    void swap(T[] arr,int i,int j){
        T temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
