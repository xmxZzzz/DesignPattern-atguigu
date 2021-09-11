package designpattern.prototype.clone;

/**
 * @ProjectName: code
 * @Package: prototype.tradition
 * @ClassName: Sheep
 * @Author: guoyy
 * @Description: 原型模式 - 1、使用默认clone()方法实现对象的克隆(浅拷贝)
 * @Date: 2021/9/11 下午1:14
 * @UpdateDate: 2021/9/11 下午1:14
 * @Version: 1.0
 */
public class Sheep implements Cloneable {
    private String name;
    private Integer age;
    private String color;
    private Sheep friend;

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", friend=" + friend +
                '}';
    }

    /*
     * @Method clone
     * @Version  1.0
     * @Description 原型模式 - 1、使用默认clone()方法实现对象的克隆(浅拷贝)
     * @param
     * @Return java.lang.Object
     * @Exception
     * @Date 2021/9/11 下午1:23
     */
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}
