package designpattern.iterator;

import java.util.Iterator;

/**
 * @Package: designpattern.iterator
 * @ClassName: ComputerCollegeIterator
 * @Author: guoyy
 * @Description: 计算机学院(数组)对应的迭代器
 * @Date: 2021/11/29 下午9:36
 * @Version: 1.0
 */
public class ComputerCollegeIterator implements Iterator {

    // 该迭代器维护一个Department[]
    Department[] departments;
    // 用于记录当前位置
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    /*
     * @Method hasNext
     * @Description  判断数组中的position是否有对应元素
     * @Return boolean
     * @Date 2021/11/29 下午9:40
     */
    @Override
    public boolean hasNext() {
        if (departments[position] == null || position >= departments.length) {
            return false;
        } else {
            return true;
        }
    }

    /*
     * @Method next
     * @Description 返回当前position位置的元素，同时position++
     * @Return java.lang.Object
     * @Date 2021/11/29 下午9:41
     */
    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }

    @Override
    public void remove() {

    }
}
