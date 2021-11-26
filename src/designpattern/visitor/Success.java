package designpattern.visitor;

public class Success extends Action {
    @Override
    void getManResult(Man man) {
        System.out.println("男性观众评价很成功");
    }

    @Override
    void getWomanResult(Woman woman) {
        System.out.println("女性观众评价很成功");
    }
}
