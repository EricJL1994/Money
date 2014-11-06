package ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import model.Currency;
import model.CurrencyMap;
import model.Exchange;
import model.Money;

public class ExchangeDialog {

    public Exchange execute(CurrencyMap currencyMap) throws IOException {
        System.out.println("Seleccione una divisa de la lista");
        System.out.println(currencyMap.toString());
        System.out.println("Introduce el código de la divisa origen");
        Currency moneyCurrency = readCurrency(currencyMap);
        System.out.println("Introduce el código de la divisa destino");
        Currency currency = readCurrency(currencyMap);
        
        return new Exchange(new Money(moneyCurrency, 200), currency);
    }
    
    private Currency readCurrency(CurrencyMap currencyMap) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Currency currency;
        String cadena;
        do{
            System.out.print("Código: ");
            cadena = br.readLine();
        }while((currency = currencyMap.findCurrency(cadena)) == null);
        
        return currency;

    }
    
    private double readAmount(){
        return Double.NaN;
    }
}
