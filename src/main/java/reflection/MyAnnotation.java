package   reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

//反射操作注解
public class MyAnnotation {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1=Class.forName("  reflection.Student2");

        //通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        //获取注解的value的值
        TableSamuel tableSamuel=(TableSamuel)c1.getAnnotation(TableSamuel.class);
        System.out.println(tableSamuel.value());

        //获得类指定的注解
        Field f=c1.getDeclaredField("name");
        FieldSamuel annotation=f.getAnnotation(FieldSamuel.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.length());
        System.out.println(annotation.type());

        System.out.println("---------------");

        f=c1.getDeclaredField("id");
        annotation=f.getAnnotation(FieldSamuel.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());

        System.out.println("---------------");

        f=c1.getDeclaredField("age");
        annotation=f.getAnnotation(FieldSamuel.class);
        System.out.println(annotation.length());
        System.out.println(annotation.type());
        System.out.println(annotation.columnName());

    }
}

@TableSamuel("db_student")
class Student2 {
    @FieldSamuel(columnName = "db_id",type = "int",length = 10)
    private int id;
    @FieldSamuel(columnName = "db_age",type = "int",length = 10)
    private int age;
    @FieldSamuel(columnName = "db_name",type = "varchar",length = 3)
    private String name;

    public Student2(){

    }

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableSamuel{
    String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldSamuel{
    String columnName();
    String type();
    int length();
}