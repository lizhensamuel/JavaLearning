package   thread;

//不安全的取钱
public class ThreadSyn02 {
    public static void main(String[] args) {
        //账户
        Account account = new Account(1000, "理财");

        Drawing you = new Drawing(account, 50, "你");
        Drawing yourWife = new Drawing(account, 100, "你老婆");

        you.start();
        yourWife.start();

    }

}

//账户
class Account {
    int money;//余额
    String name;//卡名

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

//银行:模拟取款
class Drawing extends Thread {
    //账户
    Account account;
    //取了多少钱
    int drawingMoney;
    //现在手里有多少钱
    int nowMoney;

    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;


    }

    //取钱
    //synchronized默认锁的是this
    @Override
    public void run() {
        //锁的对象就是变化的量，需要增删改的对象
        synchronized (account){
            //判断是否有钱
            if (account.money - drawingMoney < 0) {
                System.out.println(Thread.currentThread().getName() + "钱不够，取不了");
                return;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //卡内余额
            account.money = account.money - drawingMoney;

            //手里的钱
            nowMoney = nowMoney + drawingMoney;

            System.out.println(account.name + "余额为：" + account.money);
            //Thread.currentThread().getName()=this.getName();
            System.out.println(this.getName() + "手里的钱：" + nowMoney);

        }
    }
}

