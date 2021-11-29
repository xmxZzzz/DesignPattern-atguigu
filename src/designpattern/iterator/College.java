package designpattern.iterator;

import java.util.Iterator;

public interface College {

    //获取学院的名称
    String getName();

    // 为学院添加专业
    void addDepartment(Department department);

    //获取学院对应的迭代器
    Iterator createIterator();
}
