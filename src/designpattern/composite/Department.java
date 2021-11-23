package designpattern.composite;

/**
 * @Package: designpattern.composite
 * @ClassName: Department
 * @Author: guoyy
 * @Description: 专业类，继承OrganizationComponent，是叶子节点，只实现print方法
 * @Date: 2021/11/23 下午10:31
 * @Version: 1.0
 */
public class Department extends OrganizationComponent {

    public Department(String name, String desc) {
        super(name, desc);
    }

    /*
     * @Description 作为叶子结点，只负责打印信息
     * @Date 2021/11/23 下午10:33
     */
    @Override
    protected void print() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getDesc() {
        return super.getDesc();
    }

    @Override
    public void setDesc(String desc) {
        super.setDesc(desc);
    }

}
