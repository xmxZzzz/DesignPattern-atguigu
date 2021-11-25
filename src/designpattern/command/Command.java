package designpattern.command;

/**
 * @Package: designpattern.command
 * @ClassName: Command
 * @Author: guoyy
 * @Description: 命令接口
 * @Date: 2021/11/25 下午11:22
 * @Version: 1.0
 */
public interface Command {
    // 支持执行命令
    void execute();

    // 支持撤销命令
    void undo();
}
