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
        String loca1 = from.getCode();
        String loca2 = to.getCode();
        String urlloca = ("http://www.webservicex.net/CurrencyConvertor.asmx/ConversionRate?FromCurrency=" + loca1 + "&ToCurrency=" + loca2);
        URL url;
        url = new URL(urlloca);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        String cosa = "";
        while ((line = in.readLine()) != null) {
            cosa = line.substring(line.indexOf(">") + 1);
        }
        cosa = cosa.substring(0, cosa.indexOf("<"));
        double doble = Double.parseDouble(cosa);
        System.out.println(doble);
        return new ExchangeRate(from, to, doble);//MOCK
    }

}
