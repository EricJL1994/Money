package persistance;

import java.util.HashSet;
import java.util.Set;
import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {

    public CurrencySet load() {
        CurrencySet currencySet = new CurrencySet();
        currencySet.add(new Currency("Euro", "€", "EUR"));
        currencySet.add(new Currency("Dolar", "$", "USD"));
        currencySet.add(new Currency("Libra", "£", "GBP"));
        
        return currencySet;
    }
}
