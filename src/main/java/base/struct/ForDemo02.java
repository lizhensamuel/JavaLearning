package   base.struct;

public class ForDemo02 {
    public static void main(String[] args) {
        //增强for循环
        int[] numbers={1,2,3,4,5,6,7,8,9,0};
        //遍历数组的元素
        for(int x:numbers){
            System.out.print("\t"+x);
        }
        System.out.println("\n===========================");
        for (int i = 0; i <numbers.length; i++) {
            System.out.print("\t"+numbers[i]);
        }
    }
}
