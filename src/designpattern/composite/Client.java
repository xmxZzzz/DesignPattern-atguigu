package designpattern.composite;

/**
 * @Package: designpattern.composite
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试组合模式：可以生成树型结构，并支持操作
 * @Date: 2021/11/23 下午10:33
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学", "顶尖大学");

        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院");
        OrganizationComponent infoCollege = new College("信息工程学院", "信息工程学院");

        university.add(computerCollege);
        university.add(infoCollege);

        OrganizationComponent softDepartment = new Department("软件工程", "软件工程");
        OrganizationComponent netDepartment = new Department("网络工程", "网络工程");
        OrganizationComponent scienceDepartment = new Department("计算机科学与技术工程", "计算机科学与技术工程");
        computerCollege.add(softDepartment);
        computerCollege.add(netDepartment);
        computerCollege.add(scienceDepartment);

        OrganizationComponent comDepartment = new Department("通讯工程", "通讯工程");
        OrganizationComponent infoDepartment = new Department("信息工程", "信息工程");
        infoCollege.add(comDepartment);
        infoCollege.add(infoDepartment);

        //打印university信息
        university.print();

        //删除netDepartment
        infoCollege.remove(infoDepartment);
        university.print();

        //删除computerCollege
        university.remove(computerCollege);
        university.print();

    }
}
