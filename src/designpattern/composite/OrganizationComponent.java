package designpattern.composite;

/**
 * @Package: designpattern.composite
 * @ClassName: OrganizationComponent
 * @Author: guoyy
 * @Description: 学校、学院、专业的共同抽象类
 * @Date: 2021/11/23 下午10:18
 * @Version: 1.0
 */
public abstract class OrganizationComponent {
    private String name;
    private String desc;

    /*
     * @Description 设置默认方法add，因为leaf节点无该方法
     * @param organizationComponent
     * @Date 2021/11/23 下午10:22
     */
    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    /*
     * @Description 设置默认方法remove，因为leaf节点无该方法
     * @param organizationComponent
     * @Date 2021/11/23 下午10:22
     */
    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    /*
     * @Description 打印信息，抽象方法
     * @Date 2021/11/23 下午10:23
     */
    protected abstract void print();

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
