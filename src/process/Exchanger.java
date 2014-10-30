package process;

import model.Exchange;
import model.ExchangeRate;
import model.Money;

public class Exchanger {

    public Money execute(ExchangeRate exchangeRate, Exchange exchange) {
        return new Money(exchange.getCurrency(), exchange.getMoney().getAmount()*exchangeRate.getRate());
    }

    
}
