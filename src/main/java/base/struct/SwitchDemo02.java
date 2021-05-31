package   base.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        String name="Samuel";
        //JDK7新特性，表达式结果可以是字符串
        //字符的本质还是数字
        switch (name){
            case "Samuel":
                System.out.println("Samuel");
                break;
            case "Muil":
                System.out.println("Muil");
                break;
            default:
                System.out.println("弄啥呢");

        }
    }



}
