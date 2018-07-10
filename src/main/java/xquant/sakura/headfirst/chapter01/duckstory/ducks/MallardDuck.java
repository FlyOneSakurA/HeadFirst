package xquant.sakura.headfirst.chapter01.duckstory.ducks;

import xquant.sakura.headfirst.chapter01.duckstory.base.Duck;
import xquant.sakura.headfirst.chapter01.duckstory.behavior.fly.FlyWithWings;
import xquant.sakura.headfirst.chapter01.duckstory.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("是一只真鸭子------");
    }
}
