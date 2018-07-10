package xquant.sakura.headfirst.chapter03.coffee;

/**
 * 浓缩咖啡
 * */
public class Espresso extends Beverage{


    public Espresso(Size s) {
        size = s;
        description = size.name() + " Espresso";
    }

    public double cost() {
        return 1.99 * size.ordinal();
    }
}
