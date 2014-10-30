package control;

import model.CurrencySet;
import persistance.ExchangeRateLoader;
import ui.ExchangeDialog;

public class ExchangeOperation {

    public void execute(CurrencySet currencySet) {
        new ExchangeRateLoader().load();
        new ExchangeDialog().execute();
    }
}
