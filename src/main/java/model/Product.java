package model;

public abstract class Product {
    private static int sequencer = 100;
    private  int id ;
    private double price;
    private   String productName;


    public Product( double price, String productName) {
        this.id = sequencer;
        this.price = price;
        this.productName = productName;
    }

    protected Product() {
    }

    public static int getSequencer() {
        return sequencer;
    }


    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public  String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public abstract String examine();

    public  abstract String use();
}

