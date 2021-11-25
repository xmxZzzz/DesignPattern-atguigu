package designpattern.command;

/**
 * @Package: designpattern.command
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试命令模式
 * @Date: 2021/11/25 下午11:39
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //电灯
        LightReceiver lightReceiver = new LightReceiver();
        Command lightOnCommand = new LightOnCommand(lightReceiver);
        Command lightOffCommand = new LightOffCommand(lightReceiver);
        RemoteController remoteController = new RemoteController();
        //第一排是电灯的按钮：开 关
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        //电视
        TVReceiver tvReceiver = new TVReceiver();
        Command tvOnCommand = new TVOnCommand(tvReceiver);
        Command tvOffCommand = new TVOffCommand(tvReceiver);
        //第二排是电视的按钮：开 关
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);

        System.out.println("==========执行电灯的打开命令==========");
        remoteController.onButton(0);
        System.out.println("==========执行电灯的关闭命令==========");
        remoteController.offButton(0);
        System.out.println("==========执行撤销命令==========");
        remoteController.undoButton();

        System.out.println("==========执行电视的打开命令==========");
        remoteController.onButton(1);
        System.out.println("==========执行电视的关闭命令==========");
        remoteController.offButton(1);
        System.out.println("==========执行撤销命令==========");
        remoteController.undoButton();

        //第二次撤销无影响
        System.out.println("==========执行撤销命令==========");
        remoteController.undoButton();

        System.out.println("==========执行电灯的打开命令==========");
        remoteController.onButton(0);
        System.out.println("==========执行撤销命令==========");
        remoteController.undoButton();
        System.out.println("==========执行电视的打开命令==========");
        remoteController.onButton(1);
        System.out.println("==========执行电视的关闭命令==========");
        remoteController.offButton(1);
        System.out.println("==========执行电灯的关闭命令==========");
        remoteController.offButton(0);

    }
}
