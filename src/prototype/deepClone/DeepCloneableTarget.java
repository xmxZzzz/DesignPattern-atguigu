package prototype.deepClone;

import java.io.Serializable;

/**
 * @ProjectName: code
 * @Package: prototype.deepClone
 * @ClassName: DeepCloneTarget
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/11 下午1:59
 * @UpdateDate: 2021/9/11 下午1:59
 * @Version: 1.0
 */
public class DeepCloneableTarget implements Cloneable, Serializable {
    private String name;
    private Integer age;

    public DeepCloneableTarget(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "DeepCloneableTarget{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
