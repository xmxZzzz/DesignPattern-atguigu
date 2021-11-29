package designpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Package: designpattern.iterator
 * @ClassName: InfoCollegeIterator
 * @Author: guoyy
 * @Description: 信息学院(List)对应的迭代器
 * @Date: 2021/11/29 下午9:44
 * @Version: 1.0
 */
public class InfoCollegeIterator implements Iterator {

    //该迭代器维护一个List
    List<Department> departmentList;
    int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    /*
     * @Method hasNext
     * @Version  1.0
     * @Description index
     * @Return boolean
     * @Date 2021/11/29 下午9:50
     */
    @Override
    public boolean hasNext() {
        if (index >= this.departmentList.size() - 1) {
            return false;
        } else {
            index++;
            return true;
        }
    }

    /*
     * @Method next
     * @Version  1.0
     * @Description 返回当前index位置的元素，同时index++
     * @Return java.lang.Object
     * @Date 2021/11/29 下午9:50
     */
    @Override
    public Object next() {
        return this.departmentList.get(index);
    }

    @Override
    public void remove() {

    }
}
