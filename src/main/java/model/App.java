package model;


import service.Currency;
import service.VendingMachine;
import service.VendingMachineImpl;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {



        Product[] products = {
                new Candy(5, "candy"),
                new Candy(5, "candy"),
                new Goodis(50, "goodis"),
                new Goodis(50, "goodis"),
                new Marshmallows(  "marshmallows", 100),
                new Marshmallows("marshmallows", 100)
        };
        VendingMachine vendingMachine = new VendingMachineImpl(products);

        for (String string : vendingMachine.getProducts()) {
            System.out.println(string);
            System.out.println("-----");
        }

        vendingMachine.addCurrency(50);
        Product Candy = vendingMachine.request(0);
        System.out.println(Candy.use());
        System.out.println(vendingMachine.getBalance());


    }
}





