package   base.array;

public class Demo01 {
    public static void main(String[] args) {
         //数组的声明方式有两种
        int[] nums;//第一种声明方式，首选定义方式
        int nums2[];//第二种声明方式，是c/c++风格的定义方式

        nums=new int[10];//使用new来创建数组

        for (int i = 0; i <nums.length ; i++) {
            nums[i]=i+1;//通过遍历往数组中添加数组元素
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);//通过遍历从数组中读取数组元素
        }
    }
}
