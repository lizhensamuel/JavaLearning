package   io;

import java.io.*;

//实现了serializable接口的对象才能序列化
//DataInputStream用法类似ObjectInputStream
public class ObjectDemo01 {
    public static void main(String[] args) {
        Test test=new Test(24,"Samuel");
        Test test1=new Test();
        byte[] data=null;
        //序列化
        try(ByteArrayOutputStream bos=new ByteArrayOutputStream();
            ObjectOutputStream oos=new ObjectOutputStream(bos))
        {
            oos.writeInt(12);
            oos.writeDouble(22.2);
            oos.writeUTF("敲里吗");
            oos.writeObject(test);
            data=bos.toByteArray();

        } catch (IOException e) {
            e.printStackTrace();
        }
        //反序列化
        System.out.println("\n=============================");
        try(ByteArrayInputStream bis=new ByteArrayInputStream(data);
            ObjectInputStream ois=new ObjectInputStream(bis))
        {
            //必须按序列化时的顺序进行反序列化
            System.out.println(ois.readInt());
            System.out.println(ois.readDouble());
            System.out.println(ois.readUTF());
            test1=(Test)ois.readObject();
            System.out.println(test1.getAge());
            System.out.println(test1.getName());


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Test implements Serializable {
    private int age;
    private String name;

    public Test(int age,String name){
        this.age=age;
        this.name=name;
    }

    public Test(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
