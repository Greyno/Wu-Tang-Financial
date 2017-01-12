package reynoldstitko.gillian.currencyexchange;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gillianreynolds-titko on 1/12/17.
 */
public class CurrencyExchange {

    private String sourceCountryCode = "EUR";
    private String destinationCountryCode = "GBD";
    private double sourceCountryExchangeRate = 68.32;
    private double destinationCountryExchangeRate = 1.32;
    private double exchangeRate = 1.0;

    //Help with Map definition from Tony P

    static Map<String, Double> currencies = new HashMap<String, Double>();
    static  {
        currencies.put("USD", 1.00d);
        currencies.put("EUR", 0.94d);
        currencies.put("GBP", 0.82d);
        currencies.put("INR", 68.32d);
        currencies.put("AUD", 1.35d);
        currencies.put("CAD", 1.32d);
        currencies.put("SGD", 1.43d);
        currencies.put("CHF", 1.01);
        currencies.put("MYR", 4.47);
        currencies.put("JPY", 115.84);
        currencies.put("CNY", 6.92);
    }

    public double calculateExchangeRate(String sourceCountryCode, String destinationCountryCode){
        return exchangeRate = currencies.get(destinationCountryCode)/ currencies.get(sourceCountryCode);
    }

    public double convertFromSourceToDestinationRate(double amount){
        return amount * exchangeRate;
    }

    public double convertFromDollarToEuro(Double amount) {
        return (currencies.get("EUR")/currencies.get("USD"))*amount;
    }

    public double convertFromEuroToDollar(String sourceCode, String destCode) {
        return destinationCountryExchangeRate/sourceCountryExchangeRate;
    }

    public double convertFromEuroToBritish(String sourceCode, String destCode) {
        return destinationCountryExchangeRate/sourceCountryExchangeRate;
    }

    public double convertFromPoundToRupee(String sourceCode, String destCode) {
        return destinationCountryExchangeRate/sourceCountryExchangeRate;
    }

    public double convertFromRupeeToCanadian(String sourceCode, String destCode) {
        //return Math.floor(((destinationCountryExchangeRate/sourceCountryExchangeRate)*100))/100;
        return destinationCountryExchangeRate/sourceCountryExchangeRate;
    }

    public double convertFromCanadianToSingapore(String sourceCode, String destCode) {
        return destinationCountryExchangeRate/sourceCountryExchangeRate;
    }

    public double convertFromSingaporeToSwiss(String sourceCode, String destCode) {
        return destinationCountryExchangeRate/sourceCountryExchangeRate;
    }

    public double convertFromSwissToMalaysian(String sourceCode, String destCode) {
        return destinationCountryExchangeRate/sourceCountryExchangeRate;
    }

    public double convertFromMalaysianToJapanese(String sourceCode, String destCode) {
        return destinationCountryExchangeRate/sourceCountryExchangeRate;
    }

    public double convertFromJapaneseToYuan(String sourceCode, String destCode) {
        return destinationCountryExchangeRate/sourceCountryExchangeRate;
    }
}
