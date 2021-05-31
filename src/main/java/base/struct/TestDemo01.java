package   base.struct;
/*
     *
    ***
   *****
  *******
 *********
 可以理解为一个矩形，左上角是空白部分，中间的三角形可以对半切开
 */
public class TestDemo01 {
    public static void main(String[] args) {
        //打印三角形
        for (int i = 1; i <= 6; i++) {
            for(int j=6;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
