package xquant.sakura.headfirst.chapter03.coffee;

/**
 * 饮料抽象类 2018-07-10 张锎锎
 * */
public abstract class Beverage {

    String description = "Unknow Beverage";

    Size size;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
