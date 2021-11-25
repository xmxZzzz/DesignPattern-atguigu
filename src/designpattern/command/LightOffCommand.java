package designpattern.command;

/**
 * @Package: designpattern.command
 * @ClassName: LightOffCommand
 * @Author: guoyy
 * @Description: 电灯的关命令
 * @Date: 2021/11/25 下午11:27
 * @Version: 1.0
 */
public class LightOffCommand implements Command {

    // 维护一个命令执行者LightReceiver
    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
