package designpattern.observer.improve;

public interface Subject {
    // 注册观察者
    void registryObserver(Observer o);

    //移出观察者
    void removeObserver(Observer o);

    //通知所有观察者
    void notifyAllObserver();
}
