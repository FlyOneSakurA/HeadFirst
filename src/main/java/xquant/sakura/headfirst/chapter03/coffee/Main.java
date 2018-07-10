package xquant.sakura.headfirst.chapter03.coffee;

import xquant.sakura.headfirst.chapter03.coffee.condiment.Mocha;

public class Main {


    public static void main(String[] args){
        Beverage beverage = new Espresso(Size.LARGE);
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }

}
