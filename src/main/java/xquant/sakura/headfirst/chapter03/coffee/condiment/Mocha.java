package xquant.sakura.headfirst.chapter03.coffee.condiment;

import xquant.sakura.headfirst.chapter03.coffee.Beverage;
import xquant.sakura.headfirst.chapter03.coffee.Condiment;

public class Mocha extends Condiment {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + .20;
    }
}
