package model;

import java.util.HashSet;
import java.util.Set;
import model.hechos.Currency;

public class CurrencySet {

    private final Set<Currency> currencySet;

    public CurrencySet() {
        this.currencySet = new HashSet<>();
    }
    
    public void add (Currency currency){
        currencySet.add(currency);
    }

    
}
