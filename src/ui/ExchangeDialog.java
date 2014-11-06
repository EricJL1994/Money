package ui;

import model.Currency;
import model.CurrencySet;
import model.Exchange;
import model.Money;

public class ExchangeDialog {

    public Exchange execute(CurrencySet currencySet) {
        return new Exchange(new Money(new Currency("Euro", "€", "EUR"), 200), new Currency("Libra", "£", "GBP"));//MOCK
    }
    
}
