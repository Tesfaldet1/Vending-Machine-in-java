package service;

import model.Product;

import java.util.Arrays;

public class VendingMachineImpl implements VendingMachine {
    private double addCurrency;
    private int money;
    private Product[] products;
    private int depositPool;
    private Currency checkCurrency;

    public VendingMachineImpl(int depositPool, Currency checkCurrency) {
        this.depositPool = depositPool;
        this.checkCurrency = checkCurrency;

    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getDepositPool() {
        depositPool = depositPool;
        return 0;
    }

    public void setDepositPool(int depositPool) {
        this.depositPool = depositPool;
    }

    public Currency getCheckCurrency() {
        return checkCurrency;
    }

    public void setCheckCurrency(Currency checkCurrency) {
        this.checkCurrency = checkCurrency;
    }

    public void registeredCertificate(Product Produc) {
        if (products == null) products = new Product[0];
        Product[] newArray = Arrays.copyOf(products, products.length + 1);
        newArray[newArray.length - 1] = Produc;
        products = newArray;
    }

    @Override
    public double addCurrency(String type, double amount) { // 6
        this.addCurrency = amount;
        switch (type) {


        }
        double balance = amount;
        while (balance > 0) {

        }
        //System.out.println("WELCOME TO THE VENDING MACHINE");
        for (Product product : products) {
            if (addCurrency == Currency.getValue()) {
                amount = addCurrency;
            }
        }

        return amount;
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
        for (Product product : products) {
            if (id == product.getId()) {
                return product;
            }
        }
        return null;
    }

    @Override
    public int endSession() {
        products = new Product[]{};
        return 0;
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
        for (Product product : products) {
            if (Product.getSequencer() != 0)
                return new String[]{product.examine()
                };
        }
            return new String[0];
        }

    }



