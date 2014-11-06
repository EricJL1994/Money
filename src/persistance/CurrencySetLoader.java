package persistance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import model.Currency;
import model.CurrencySet;

public class CurrencySetLoader {

    public CurrencySet load() throws FileNotFoundException, IOException {
        CurrencySet currencySet = new CurrencySet();
        
        
        File file = new File("currency.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null){
            String[] currencyArray = line.split(",");
            currencySet.add(new Currency(currencyArray[0], currencyArray[1], currencyArray[2]));
        }
        /*
        currencySet.add(new Currency("Euro", "€", "EUR"));
        currencySet.add(new Currency("Dolar", "$", "USD"));
        currencySet.add(new Currency("Libra", "£", "GBP"));
        */
        return currencySet;
    }
}
