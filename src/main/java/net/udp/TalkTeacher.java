package   net.udp;

public class   TalkTeacher {
    public static void main(String[] args) {
        new Thread(new TalkSender(5555,"localhost",8888)).start();
        new Thread(new TalkReceive(9999,"学生")).start();
    }
}
