package aplication;

import control.ExchangeOperation;
import model.CurrencySet;
import persistance.CurrencySetLoader;

public class App {

    public static void main(String[] args) {
        
        CurrencySet currencySet = new CurrencySetLoader().load();
        new ExchangeOperation().execute(currencySet);
    }
}
