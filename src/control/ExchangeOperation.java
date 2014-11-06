package control;

import java.io.IOException;
import model.CurrencyMap;
import model.Exchange;
import model.ExchangeRate;
import model.Money;
import persistance.ExchangeRateLoader;
import process.Exchanger;
import ui.ExchangeDialog;
import ui.MoneyDisplay;

public class ExchangeOperation {

    public void execute(CurrencyMap currencyMap) throws IOException {
        Exchange exchange = new ExchangeDialog().execute(currencyMap);
        ExchangeRate exchangeRate = new ExchangeRateLoader().load(exchange.getMoney().getCurrency(), exchange.getCurrency());
        Money money = new Exchanger().execute(exchangeRate, exchange);
        new MoneyDisplay().display(money);
    }
}
