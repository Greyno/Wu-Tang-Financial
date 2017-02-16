package reynoldstitko.gillian.currencyexchange.reynoldstitko;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by gillianreynolds-titko on 2/16/17.
 */
public class CurrencyExchangev2 {

    public String[] currency = {"USD", "EUR", "GBP", "INR", "AUD", "CAD", "SGD", "CHF", "MYR", "JPY", "CNY"};
    public double[] rate = {1.00, 0.94, 0.82, 68.32, 1.35, 1.32, 1.43, 1.01, 4.47, 115.84, 6.92};

    public String convert(double amountToExchange, String fromCountry, String toCountry){
        double rateFrom = rate[Arrays.asList(currency).indexOf(fromCountry)];
        double rateTo = rate[Arrays.asList(currency).indexOf(toCountry)];

        return String.format("%.2f", amountToExchange * rateTo/rateFrom);
    }

    public Double convert(String fromCountry, String toCountry, double amountToExchange){
        double rateFrom = rate[Arrays.asList(currency).indexOf(fromCountry)];
        double rateTo = rate[Arrays.asList(currency).indexOf(toCountry)];
        return (amountToExchange * rateTo)/rateFrom;
    }

}
