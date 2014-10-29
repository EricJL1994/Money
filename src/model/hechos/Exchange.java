package model.hechos;

import model.hechos.Currency;
import java.util.Date;

public class Exchange {
    private final Money input;
    private final Currency[] currency;
    private final Date date;

    public Exchange(Money input, Currency[] currency, Date date) {
        this.input = input;
        this.currency = currency;
        this.date = date;
    }

    public Money getInput() {
        return input;
    }

    public Currency[] getCurrency() {
        return currency;
    }

    public Date getDate() {
        return date;
    }
}
