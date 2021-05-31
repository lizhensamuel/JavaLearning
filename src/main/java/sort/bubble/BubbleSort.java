package sort.bubble;

import java.util.Arrays;

/*
冒泡排序：
1.比较数组中，两个相邻的元素，如果第一个比第二个数大，我们就交换他们的位置
2.每一次比较，都会产生一个最大或者最小的数字
3.下一轮则可以少一次排序
4.依次循环，直到结束
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a=new int[10000];
        long starTime=0;
        long starTime2=0;
        long endTime=0;
        long endTime2=0;
        Arrays.fill(a,3);
        starTime=System.currentTimeMillis();
        System.out.println(Arrays.toString(sort(a)));
        endTime=System.currentTimeMillis();
        System.out.println("优化前耗时："+(endTime-starTime)+"ms");

        starTime2=System.currentTimeMillis();
        System.out.println(Arrays.toString(sort2(a)));
        endTime2=System.currentTimeMillis();
        System.out.println("优化后耗时："+(endTime2-starTime2)+"ms");
    }

    public static int[] sort(int[] array){
        int temp=0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j+1]<array[j]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }

    public static int[] sort2(int[] array){
        int temp=0;
        boolean flag=false;//设置判断原始数组是否需要排序
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j+1]<array[j]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=true;//说明发生了位置交换，原始数组需要进行排序
                }
            }
            if(flag==false){
                break;//跳过排序步骤
            }
        }

        return array;
    }

}
