package designpattern.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Package: designpattern.interpreter
 * @ClassName: Calculator
 * @Author: guoyy
 * @Description: 上下文context，用于计算加减法
 * @Date: 2021/12/8 下午11:05
 * @Version: 1.0
 */
public class Calculator {

    //用于接收表达式
    private Expression expression;

    /*
     * @Method Calculator
     * @Version  1.0
     * @Description 构造方法中接收表达式字符串，并解析
     * @param expStr 表达式字符串
     * @Date 2021/12/8 下午11:03
     */
    public Calculator(String expStr) {
        //栈，用于存放表达式及过程
        Stack<Expression> stack = new Stack<>();
        char[] chars = expStr.toCharArray();

        Expression left = null;
        Expression right = null;
        //遍历每一个符号
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
                    break;
            }
        }
        //此时stack中只留下最后一个表达式，将其赋值给成员变量expression
        this.expression = stack.pop();
    }

    /*
     * @Method run
     * @Version  1.0
     * @Description 计算最终的结果
     * @param var 存放变量和数值：{a=10,b=20}
     * @Return int 计算结果
     * @Date 2021/12/8 下午11:13
     */
    public int run(HashMap<String, Integer> var) {
        return this.expression.interpret(var);
    }
}
