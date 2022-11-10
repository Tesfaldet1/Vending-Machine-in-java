package service;

import model.Product;

public interface VendingMachine {
    double addCurrency(String type,double amount);
    int getBalance();
    Product request(int id);
    int endSession();
    String getDescription(int id);
    String[] getProducts();





}
