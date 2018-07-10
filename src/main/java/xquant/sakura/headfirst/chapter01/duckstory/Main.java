package xquant.sakura.headfirst.chapter01.duckstory;

import xquant.sakura.headfirst.chapter01.duckstory.base.Duck;
import xquant.sakura.headfirst.chapter01.duckstory.ducks.MallardDuck;

public class Main {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.fly();
        duck.quack();
    }
}
