package designpattern.command;

/**
 * @Package: designpattern.command
 * @ClassName: LightOnCommand
 * @Author: guoyy
 * @Description: 电灯的开命令
 * @Date: 2021/11/25 下午11:25
 * @Version: 1.0
 */
public class LightOnCommand implements Command {

    // 维护一个命令执行者LightReceiver
    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
