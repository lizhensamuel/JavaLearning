package   base.struct;

public class ForDemo01 {
    public static void main(String[] args) {
        //使用“循环次数.for”可以快捷创建for循环语句
        for (int i = 0; i < 100; i++) {
        }
        //练习1：分别计算0到100之间的奇数与偶数的和
        int oddSum=0;
        int evenSum=0;
        for (int i = 0; i <= 100; i++) {
            if(i%2!=0){
                oddSum+=i;
            }else {
                evenSum+=i;
            }
        }
        System.out.println("奇数和为："+oddSum);
        System.out.println("偶数和为："+evenSum);
        System.out.println("=======================================");
        //练习2：输出1000以内能被5整除的数且一行输出三个

        for (int i = 0; i <= 1000; i++) {
            if(i%5==0){
                System.out.print(i+"\t");
            }
            if(i%(5*3)==0){
                System.out.println();
                //System.out.print("\n");
            }
        }

        System.out.println("\n=========================================");
        //练习3:输出九九乘法表

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
