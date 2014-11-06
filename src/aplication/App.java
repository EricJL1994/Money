package aplication;

import control.ExchangeOperation;
import java.io.IOException;
import model.Currency;
import model.CurrencySet;
import persistance.CurrencySetLoader;

public class App {

    public static void main(String[] args) throws IOException {
        Currency loca = new Currency("Euro", "€", "EUR");
        System.out.println(loca.toString());
        /*
        CurrencySet currencySet = new CurrencySetLoader().load();
        new ExchangeOperation().execute(currencySet);*/
    }
}
