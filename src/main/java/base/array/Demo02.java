package   base.array;

/*
数组的使用：
1.使用普通for循环对数组进行操作
2.使用增强for循环对数组进行遍历
3.将数组作为方法的参数使用
4.将数组作为返回值使用
 */
public class Demo02 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        //使用普通for循环对数组进行操作：输出第3个元素的值
        for (int i = 0; i < array.length; i++) {
            if (i == (3 - 1)) {
                System.out.println(array[i]);
                System.out.println("=================");
            }
        }

        //使用增强for循环遍历数组
        for (int a : array) {
            System.out.println(a);
        }
        System.out.println("=================");

        printArray(reverseArray(array));

    }
        //将数组作为方法参数
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
        //将数组作为返回值使用
    public static int[] reverseArray(int[] array){
        int[] result=new int[array.length];
        for (int i = 0,j=array.length-1; i <array.length ; i++,j--) {
            result[j]=array[i];
        }
        return result;
    }
}
