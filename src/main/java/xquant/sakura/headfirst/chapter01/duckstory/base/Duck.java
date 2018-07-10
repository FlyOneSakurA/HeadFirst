package xquant.sakura.headfirst.chapter01.duckstory.base;

import xquant.sakura.headfirst.chapter01.duckstory.behavior.fly.IFly;
import xquant.sakura.headfirst.chapter01.duckstory.behavior.quack.IQuack;

public abstract class Duck {

    //飞行行为
    public IFly flyBehavior;

    //叫声行为
    public IQuack quackBehavior;

    public Duck() { }

    //鸭子样子 每个鸭子不同
    public abstract void display();

    /**
     * 委托给行为类
     * */
    public void fly(){
        flyBehavior.fly();
    }

    public void quack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("所有鸭子都会游泳------");
    }
}
