package designpattern.interpreter;

import java.util.HashMap;

/**
 * @Package: designpattern.interpreter
 * @ClassName: VarExpression
 * @Author: guoyy
 * @Description: 终结符表达式，即表达式中的变量
 * @Date: 2021/12/8 下午10:52
 * @Version: 1.0
 */
public class VarExpression extends Expression {

    //维护表达式的变量，如a,b
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    /*
     * @Method interpret
     * @Version  1.0
     * @Description 根据变量获取对应的值
     * @param var 存放表示式变量和其对应值的HashMap
     * @Return int 返回变量值
     * @Date 2021/12/8 下午10:51
     */
    @Override
    public int interpret(HashMap<String, Integer> var) {
        return var.get(this.key);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
