package persistance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import model.Currency;
import model.CurrencyMap;

public class CurrencyMapLoader {

    public CurrencyMap load() throws FileNotFoundException, IOException {
        CurrencyMap currencyMap = new CurrencyMap();
        
        
        File file = new File("currency.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null){
            String[] currencyFields = line.split(",");
            currencyMap.add(new Currency(currencyFields[0], currencyFields[1], currencyFields[2]));
            
        }
        return currencyMap;
    }
}
