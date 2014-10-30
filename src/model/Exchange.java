package model;

import java.util.Date;

public class Exchange {
    private final Money input;
    private final Currency[] currency;

    public Exchange(Money input, Currency[] currency, Date date) {
        this.input = input;
        this.currency = currency;
    }

    public Money getInput() {
        return input;
    }

    public Currency[] getCurrency() {
        return currency;
    }

}
