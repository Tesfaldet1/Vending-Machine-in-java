package model;


import service.Currency;
import service.VendingMachine;
import service.VendingMachineImpl;

import java.util.Scanner;

public class App
{
    public static void main(String[] args) {

        Candy candy= new Candy();
        System.out.println(candy.examine());

        Goodis goodis = new Goodis();
        System.out.println(goodis.examine());
        VendingMachineImpl vendingMachineImpl= new VendingMachineImpl(1, Currency.ONE_KRONOR);
        System.out.println(vendingMachineImpl.addCurrency("",1));

        Marshmallows marshmallows = new Marshmallows();
        System.out.println(marshmallows.getPrice());

        Scanner scanner = new Scanner(System.in);



    }
}
