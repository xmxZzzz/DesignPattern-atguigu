package designpattern.prototype.tradition;

/**
 * @ProjectName: code
 * @Package: prototype.tradition
 * @ClassName: Sheep
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/11 下午1:14
 * @UpdateDate: 2021/9/11 下午1:14
 * @Version: 1.0
 */
public class Sheep {
    private String name;
    private Integer age;
    private String color;

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

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
