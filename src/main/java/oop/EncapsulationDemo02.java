package   oop;

/*
    封装的意义：
    1.提高程序的安全性，保护数据
    2.隐藏代码的实现细节
    3.统一接口
    4.提高了系统可维护性
 */
public class EncapsulationDemo02 {
    public static void main(String[] args) {

    }
}

class EncapsulationDemo002{
    private String name;
    private int age;
    private char sex;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age>120||age<0){
            this.age=0;
        }else{
            this.age = age;
        }

    }

    public void setSex(char sex) {
        if(sex=='男'||sex=='女'){
            this.sex = sex;
        }

    }
}
