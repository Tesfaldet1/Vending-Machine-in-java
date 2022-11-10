package service;

import model.Product;

public enum Money {

    Candy (101,20),
    Goodis (102,50),
    Marshmallows (103,100);

    private int price;
    private int id;
    Money(int value, int id) {
        this.price=price;
        this.id = Product.getSequencer();
    }
    public  int getId(){
        return this.price;
    }
    public int getValue() {
        return this.id;
    }
}

