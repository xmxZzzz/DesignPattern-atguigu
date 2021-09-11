package designpattern.prototype.deepClone;

import java.io.*;

/**
 * @ProjectName: code
 * @Package: prototype.deepClone
 * @ClassName: DeepPrototype
 * @Author: guoyy
 * @Description:
 * @Date: 2021/9/11 下午2:02
 * @UpdateDate: 2021/9/11 下午2:02
 * @Version: 1.0
 */
public class DeepPrototype implements Cloneable, Serializable {

    private String name;
    private DeepCloneableTarget deepCloneableTarget;

    public DeepPrototype(String name, DeepCloneableTarget deepCloneableTarget) {
        this.name = name;
        this.deepCloneableTarget = deepCloneableTarget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }

    @Override
    public String toString() {
        return "DeepPrototype{" +
                "name='" + name + '\'' +
                ", deepCloneableTarget=" + deepCloneableTarget +
                '}';
    }

    /*
     * @Method clone
     * @Version  1.0
     * @Description 深克隆实现方法 - 1、clone()方法
     * @param
     * @Return java.lang.Object
     * @Exception
     * @Date 2021/9/11 下午2:03
     */
    @Override
    protected Object clone() {
        DeepPrototype deepPrototype = null;
        try {
            //完成对基本数据类型和String的值拷贝
            deepPrototype = (DeepPrototype) super.clone();
            //因为DeepCloneableTarget的属性都是String类型，所以使用super.clone()即可实现值拷贝
            DeepCloneableTarget deepCloneableTarget = (DeepCloneableTarget) this.getDeepCloneableTarget().clone();
            deepPrototype.setDeepCloneableTarget(deepCloneableTarget);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deepPrototype;
    }

    /*
     * @Method deepClone
     * @Version  1.0
     * @Description 深拷贝实现方法 - 2、对象的序列化（推荐使用）
     * @param
     * @Return java.lang.Object
     * @Exception
     * @Date 2021/9/11 下午2:17
     */
    public Object deepClone() {

        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //将当前对象以对象流的方式输出

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype deepPrototype = (DeepPrototype) ois.readObject();

            return deepPrototype;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
