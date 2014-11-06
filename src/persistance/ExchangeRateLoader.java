package persistance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import model.Currency;
import model.ExchangeRate;

public class ExchangeRateLoader {

    public ExchangeRate load(Currency from, Currency to) throws MalformedURLException, IOException {
        String currencyInput = from.getCode();
        String currencyOutput = to.getCode();
        String urldir = ("http://www.webservicex.net/CurrencyConvertor.asmx/ConversionRate?FromCurrency=" + currencyInput + "&ToCurrency=" + currencyOutput);
        URL url = new URL(urldir);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        String rate = "";
        while ((line = in.readLine()) != null) {
            rate = line.substring(line.indexOf(">") + 1);
        }
        rate = rate.substring(0, rate.indexOf("<"));
        double doble = Double.parseDouble(rate);
        System.out.println(doble);//PARA VER
        return new ExchangeRate(from, to, doble);
    }

}
