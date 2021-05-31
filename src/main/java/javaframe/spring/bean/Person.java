package javaframe.spring.bean;

import java.util.Date;

/**
 * @author: Samuel
 * @date: 2021-06-05 13:39
 * @description: javaframe.spring.bean
 */
public class Person {
    /**
     * 当需要通过容器来获取类的对象时，一定要保留无参构造器
     * 因为容器底层使用反射实现的，会默认调用无参构造方法
     */
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private Date date;

    public Person() {
    }

    /*
    public Person(Integer id, String name, Integer age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    */

    /*
    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(Integer id, Integer age, String gender) {
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

    public Person(Integer id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", date=" + date +
                '}';
    }
}
