package designpattern.facade;

/**
 * @Package: designpattern.facade
 * @ClassName: Client
 * @Author: guoyy
 * @Description: 测试外观模式
 * @Date: 2021/11/23 下午11:58
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.ready();
        homeTheaterFacade.play();
        homeTheaterFacade.pause();
        homeTheaterFacade.end();
    }
}
