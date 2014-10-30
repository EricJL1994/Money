package aplication;

import control.ExchangeOperation;
import model.CurrencySet;
import persistance.CurrencySetLoader;

public class App {

    public static void main(String[] args) {
        System.out.println("MOCK");
        CurrencySet currencySet = new CurrencySetLoader().load();
        new ExchangeOperation().execute(currencySet);
    }
}
