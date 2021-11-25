package designpattern.command;

/**
 * @Package: designpattern.command
 * @ClassName: NoCommand
 * @Author: guoyy
 * @Description: 空命令
 * @Date: 2021/11/25 下午11:30
 * @Version: 1.0
 */
public class NoCommand implements Command {

    public NoCommand() {
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
