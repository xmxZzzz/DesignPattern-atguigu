package designpattern.observer.improve;

public interface Observer {
    void update(float temperature, float pressure, float humidity);

    void display();
}
