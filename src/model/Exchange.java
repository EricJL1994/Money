package model;

public class Exchange {
    private final Money money;
    private final Currency currency;

    public Exchange(Money input, Currency currency) {
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
