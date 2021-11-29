package designpattern.iterator;

import java.util.Arrays;

/**
 * @Package: designpattern.iterator
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试迭代器模式
 * @Date: 2021/11/29 下午10:18
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //计算机学院下的专业
        Department department1 = new Department("Java专业", "Java专业");
        Department department2 = new Department("PHP专业", "PHP专业");
        Department department3 = new Department("大数据专业", "大数据专业");
        College computerColleges = new ComputerCollege(new Department[]{department1, department2, department3});

        // 信息工程学院下的专业
        Department department4 = new Department("信息安全专业", "信息安全专业");
        Department department5 = new Department("网络安全专业", "网络安全专业");
        Department department6 = new Department("服务器安全专业", "服务器安全专业");
        College infoCollege = new InfoCollege(Arrays.asList(department4, department5, department6));

        OutputImpl output = new OutputImpl(Arrays.asList(computerColleges, infoCollege));
        output.printCollege();
    }
}
