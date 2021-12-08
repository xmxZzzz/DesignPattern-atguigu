package designpattern.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @Package: designpattern.interpreter
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试解释器模式
 * @Date: 2021/12/8 下午11:14
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr(); // a+b
        HashMap<String, Integer> var = getValue(expStr);// var {a=10, b=20}
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果：" + expStr + "=" + calculator.run(var));
    }

    /*
     * @Method getExpStr
     * @Version  1.0
     * @Description 从控制台读取输入的表达式
     * @Return java.lang.String 输入的表达式
     * @Date 2021/12/8 下午11:19
     */
    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        //遍历输入的表达式
        for (char c : expStr.toCharArray()) {
            //如果字符不是+、-号就一定是变量
            if ('+' != c && '-' != c) {
                //如果当前变量的值之前没有输入过，则请求输入
                if (!map.containsKey(String.valueOf(c))) {
                    System.out.println("请输入" + c + "的值：");
                    String value = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(c), Integer.valueOf(value));
                }
            }
        }
        return map;
    }

}
