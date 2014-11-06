package model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CurrencyMap {

    private final Map<String, Currency> currencyMap;

    public CurrencyMap() {
        this.currencyMap = new HashMap<>();
    }

    public Map<String, Currency> getCurrencyMap() {
        return currencyMap;
    }

    public void add(Currency currency) {
        currencyMap.put(currency.getCode(), currency);
    }

    @Override
    public String toString() {
        String currencyMapString = "";
        Set<String> keySet = currencyMap.keySet();
        for (String key : keySet) {
            currencyMapString += "--------\n" + currencyMap.get(key).toString() + "\n";
        }
        return currencyMapString;
    }
    
    public Currency findCurrency(String currencyName){
        return currencyMap.get(currencyName);
    }
}
