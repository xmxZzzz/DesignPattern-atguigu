package designpattern.interpreter;

import java.util.HashMap;

/**
 * @Package: designpattern.interpreter
 * @ClassName: Expression
 * @Author: guoyy
 * @Description: 抽象表达式类
 * @Date: 2021/12/8 下午10:47
 * @Version: 1.0
 */
public abstract class Expression {
    /*
     * @Method interpret
     * @Version  1.0
     * @Description 用于解释公式和数值
     * @param var 存放数值：{a=10,b=20}
     * @Return void
     * @Date 2021/12/8 下午10:47
     */
    public abstract int interpret(HashMap<String, Integer> var);
}
