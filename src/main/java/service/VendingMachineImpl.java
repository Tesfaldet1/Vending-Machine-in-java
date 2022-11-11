package service;

import model.Product;

public class VendingMachineImpl implements VendingMachine {
    //private double addCurrency;
    private int money;
    private static Product[] products;
    private int depositPool;
    public static int [] VALID_DENOMINATIONS = {1,2,5,10,20,50,100,500,1000};
    public VendingMachineImpl(Product[] products){
        this.products =products;
    }


    public VendingMachineImpl(int depositPool, Currency checkCurrency) {
        this.depositPool = depositPool;


    }




    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getDepositPool() {
        depositPool = depositPool;
        return depositPool;
    }

    public void setDepositPool(int depositPool) {
        this.depositPool = depositPool;
    }




    public void Marshmallows(Product [] products1) {
        this.products = products;
    }

    @Override
    public void addCurrency(double amount) { // 6
        for (int validDenomination : VALID_DENOMINATIONS) {
            if (validDenomination == amount) {
                depositPool += amount;
            }
        }
    }
    @Override
    public int getBalance() {
        for (Product product : products) {
            if (money == product.getPrice()) {
                System.out.println("enjoy your product");
            } else if (money > product.getPrice()) {
                int total = (int) (money - product.getPrice());

            } else if (money < product.getPrice()) {
                System.out.println("not enough money to buy thr product");

            }
        }


        return depositPool;
    }

    @Override
    public Product request(int id) {
       for  (Product product : products) {
            if (product.getId() == id) {
                if (product.getPrice() <= depositPool) {
                    depositPool = (int) (depositPool - product.getPrice());
                    return product;
                } else {
                    throw new RuntimeException("Product " + product.getProductName() + " is too expensive");
                }
            }
        }
        throw new RuntimeException("Could not find Product with id " + id);
    }


    @Override
    public int endSession() {
        int temp = depositPool;
        depositPool = 0;
        return temp;
    }


    @Override
    public String getDescription(int id) {
        for (Product product : products) {
            if (id == product.getId()) {
                return product.use();
            }
        }

        return "the product is not available";
    }

    @Override
    public String[] getProducts() {
        String[] productsAsString = new String[products.length];
        for (int i = 0; i < products.length; i++) {
            productsAsString[i] = products[i].examine().concat(" price: " + products[i].getPrice());
        }
        return productsAsString;
    }
    }



