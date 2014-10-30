package model;

import model.Currency;
import java.util.Date;

public class ExchangeRate {
    private final Currency from;
    private final Currency to;
    private final double value;
    private Date date;

    public ExchangeRate(Currency from, Currency to, double value) {
        this.from = from;
        this.to = to;
        this.value = value;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public double getValue() {
        return value;
    }

    public Date getDate() {
        return date;
    }
}

