package designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package: designpattern.composite
 * @ClassName: University
 * @Author: guoyy
 * @Description: 大学类，继承OrganizationComponent，重写add、remove、print方法
 * @Date: 2021/11/23 下午10:24
 * @Version: 1.0
 */
public class University extends OrganizationComponent {

    //包含多个College
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String desc) {
        super(name, desc);
    }

    /*
     * @Description 实现OrganizationComponent的print方法：遍历College，并调用其print方法（递归）
     * @Date 2021/11/23 下午10:28
     */
    @Override
    protected void print() {
        System.out.println("=============" + getName() + "==============");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
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
