package service;

public enum Currency {
    ONE_KRONOR(1),
    TWO_KRONOR(2),
    FIVE_KRONOR(5),
    TEN_KRONOR(10),
    TWENTY_KRONOR(20),
    FIFTY_KRONOR(50),
    ONE_HUNDRED_KRONOR(100),
    TWO_HUNDRED_KRONOR(200),
    FIVE_HUNDRED_KRONOR(500),
    ONE_THOUSAND_KRONOR(1000);

    private  static int value;


    Currency(int value) {
        value=value;
    }

    public static int getValue() {
        return value;
    }
}

