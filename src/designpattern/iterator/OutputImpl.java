package designpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Package: designpattern.iterator
 * @ClassName: OutputImpl
 * @Author: guoyy
 * @Description: 统一的输出类
 * @Date: 2021/11/29 下午10:10
 * @Version: 1.0
 */
public class OutputImpl {

    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    /*
     * @Method printCollege
     * @Description 输出所有的学院类及其专业
     * @Date 2021/11/29 下午10:16
     */
    public void printCollege() {
        //利用List自带的迭代器输出学院的名称
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()) {
            College college = iterator.next();
            System.out.println("======" + college.getName() + "======");
            //获取对应的迭代器
            Iterator collegeIterator = college.createIterator();
            printDepartment(collegeIterator);

        }
    }

    /*
     * @Method printDepartment
     * @Version  1.0
     * @Description 根据迭代器，输出对应的专业名称
     * @param iterator 传入的迭代器参数，对应的学院的迭代器
     * @Return void
     * @Date 2021/11/29 下午10:17
     */
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
