package designpattern.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {

    //维护计算机学院的专业数组
    Department[] departments;
    //记录所属专业的个数
    int numOfDepts = 0;

    public ComputerCollege(Department[] departments) {
        this.departments = new Department[5];
        for (Department d : departments) {
            addDepartment(d);
        }
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(Department department) {
        departments[numOfDepts++] = department;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
