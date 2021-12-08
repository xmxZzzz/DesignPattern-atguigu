package designpattern.interpreter;

import java.util.HashMap;

/**
 * @Package: designpattern.interpreter
 * @ClassName: SubExpression
 * @Author: guoyy
 * @Description: 减法表达式
 * @Date: 2021/12/8 下午11:00
 * @Version: 1.0
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    /*
     * @Method interpret
     * @Version  1.0
     * @Description 减法操作
     * @param var 存放变量和数值：{a=10,b=20}
     * @Return int 运算后的结果
     * @Date 2021/12/8 下午11:00
     */
    @Override
    public int interpret(HashMap<String, Integer> var) {
        return super.getLeft().interpret(var) - super.getRight().interpret(var);
    }
}
