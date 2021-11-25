package designpattern.command;

/**
 * @Package: designpattern.command
 * @ClassName: RemoteController
 * @Author: guoyy
 * @Description: 智能遥控器，集成多个智能家电的遥控器开关
 * @Date: 2021/11/25 下午11:28
 * @Version: 1.0
 */
public class RemoteController {

    //所有打开命令
    Command[] onCommands;
    //所有关闭命令
    Command[] offCommands;
    // 撤销按钮，用于记录上一个执行的命令
    Command undoCommand;

    public RemoteController() {
        this.onCommands = new Command[5];
        this.offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            this.onCommands[i] = new NoCommand();
            this.offCommands[i] = new NoCommand();
        }
    }

    /*
     * @Method setCommand
     * @Version  1.0
     * @Description 给智能遥控器设置按钮
     * @param no 第no排按钮
     * @param onCommand 打开按钮
     * @param offCommand 关闭按钮
     * @Return void
     * @Date 2021/11/25 下午11:35
     */
    public void setCommand(int no, Command onCommand, Command offCommand) {
        this.onCommands[no] = onCommand;
        this.offCommands[no] = offCommand;
    }

    /*
     * @Method onButton
     * @Version  1.0
     * @Description 执行第no排的打开命令
     * @param no 第no排
     * @Return void
     * @Exception
     * @Date 2021/11/25 下午11:37
     */
    public void onButton(int no) {
        this.onCommands[no].execute();
        undoCommand = this.onCommands[no];
    }

    /*
     * @Method offButton
     * @Version  1.0
     * @Description 执行第no排的关闭命令
     * @param no 第no排
     * @Return void
     * @Exception
     * @Date 2021/11/25 下午11:38
     */
    public void offButton(int no) {
        this.offCommands[no].execute();
        undoCommand = this.offCommands[no];
    }

    /*
     * @Method undoButton
     * @Version  1.0
     * @Description 撤销上一次命令
     * @Return void
     * @Exception
     * @Date 2021/11/25 下午11:39
     */
    public void undoButton() {
        undoCommand.undo();
    }
}
