package   base.struct;

public class SwitchDemo01 {
    public static void main(String[] args) {
        char grade='c';
        //不使用break语句就会发生case穿透
        switch (grade){
            case 'a':
                System.out.println("优秀");
                break;
            case 'b':
                System.out.println("良好");
                break;
            case 'c':
                System.out.println("及格");
                break;
            case 'd':
                System.out.println("再接再厉");
                break;
            case 'e':
                System.out.println("挂科");
                break;
            default:
                System.out.println("???");
        }
    }
}
