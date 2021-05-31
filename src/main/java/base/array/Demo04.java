package   base.array;

import java.util.Arrays;

/*
Arrays工具类
 */
public class Demo04 {
    public static void main(String[] args) {
        int[] a=new int[]{1,3,4,5,6,5};
        //打印数组元素
        System.out.println(Arrays.toString(a));
        //对数组进行排序
        Arrays.sort(a);//升序
        System.out.println(Arrays.toString(a));
        //对数组进行赋值
        Arrays.fill(a,0);
        System.out.println(Arrays.toString(a));

        a=new int[]{1,3,4,5,6,5};
        //对数组使用二分查找
        System.out.println(Arrays.binarySearch(a,3));//返回元素下标

    }
}
