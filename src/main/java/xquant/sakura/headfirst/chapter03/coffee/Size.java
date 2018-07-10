package xquant.sakura.headfirst.chapter03.coffee;

/**
 * 饮料量大小杯
 * */
public enum Size {

    SMALL("small",1),
    MIDDLE("middle",2),
    LARGE("large",3);


    //成员变量
    private String sName;

    private int size;

    private Size(String sName,int size){
        this.sName = sName;
        this.size = size;
    }
}
