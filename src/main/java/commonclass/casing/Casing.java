package commonclass.casing;

/**
 * @author: Samuel
 * @date: 2021-05-13 9:15
 */
public class Casing {
    public static void main(String[] args) {
        //-128~127之间的数返回的是相同的实例，目的是为了节省内存
        Integer i1=Integer.valueOf(100);
        Integer i11=Integer.valueOf(100);
        //-128~127之外的数返回新的不同的实例
        Integer i2=Integer.valueOf(128);
        Integer i22=Integer.valueOf(128);


        System.out.println(i1==i11);
        System.out.println(i2==i22);
    }
}
