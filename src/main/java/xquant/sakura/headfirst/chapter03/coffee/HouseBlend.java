package xquant.sakura.headfirst.chapter03.coffee;

public class HouseBlend extends Beverage{

    public HouseBlend(Size s) {
        size = s;
        description = size.name() + " House Blend Coffee";
    }

    public double cost() {
        return .89 * size.ordinal();
    }
}
