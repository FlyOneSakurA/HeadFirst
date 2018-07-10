package xquant.sakura.headfirst.chapter01.duckstory.behavior.quack;

/**
 * 无法叫的叫声行为实现类 2018-07-04 张锎锎
 * */
public class MuteQuack implements IQuack{

    public void quack() {
        System.out.println("不会叫，安静的很------");
    }
}
