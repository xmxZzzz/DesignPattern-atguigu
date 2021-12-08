package designpattern.interpreter;

import java.util.HashMap;

/**
 * @Package: designpattern.interpreter
 * @ClassName: SymbolExpression
 * @Author: guoyy
 * @Description: 非终结符表达式，即表达式中的运算符
 * @Date: 2021/12/8 下午10:56
 * @Version: 1.0
 */
public class SymbolExpression extends Expression {

    //维护该符号左边的表达式
    private Expression left;
    //维护该符号右边的表达式
    private Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /*
     * @Method interpret
     * @Version  1.0
     * @Description 因具体解释由其子节点类实现，所以此处为空实现
     * @Date 2021/12/8 下午10:53
     */
    @Override
    public int interpret(HashMap<String, Integer> var) {
        return 0;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }
}
