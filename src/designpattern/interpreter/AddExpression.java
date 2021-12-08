package designpattern.interpreter;

import java.util.HashMap;

/**
 * @Package: designpattern.interpreter
 * @ClassName: AddExpression
 * @Author: guoyy
 * @Description: 加法表达式
 * @Date: 2021/12/8 下午10:59
 * @Version: 1.0
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    /*
     * @Method interpret
     * @Version  1.0
     * @Description 处理加法操作
     * @param var 存放变量和数值：{a=10,b=20}
     * @Return int 运算后的结果
     * @Date 2021/12/8 下午10:58
     */
    @Override
    public int interpret(HashMap<String, Integer> var) {
        return super.getLeft().interpret(var) + super.getRight().interpret(var);
    }
}
