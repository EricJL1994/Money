package model;

import java.util.Date;

public class Exchange {
    private final Money money;
    private final Currency currency;

    public Exchange(Money input, Currency currency, Date date) {
        this.money = input;
        this.currency = currency;
    }

    public Money getMoney() {
        return money;
    }

    public Currency getCurrency() {
        return currency;
    }

}
