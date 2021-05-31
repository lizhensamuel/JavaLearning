package   base.method;
//通过命令行传入参数并输出
public class Demo03 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]:" + args[i]);
        }
    }
}
