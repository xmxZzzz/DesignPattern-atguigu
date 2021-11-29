package designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {

    //维护信息工程学院专业的List
    List<Department> departmentList;

    public InfoCollege(List<Department> departmentList) {
        this.departmentList = new ArrayList<>();
        for (Department d : departmentList) {
            addDepartment(d);
        }
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(Department department) {
        this.departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
