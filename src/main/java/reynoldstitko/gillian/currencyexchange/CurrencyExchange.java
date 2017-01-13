package reynoldstitko.gillian.currencyexchange;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gillianreynolds-titko on 1/12/17.
 */
public class CurrencyExchange {

    private double sourceCountryExchangeRate = 68.32;
    private double destinationCountryExchangeRate = 1.32;
    private double exchangeRate = 1.0;
    private String sourceCountryCode;
    private String destinationCountryCode;

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

    //Create constructors for the CurrencyExchange class

    CurrencyExchange(){
    }

    CurrencyExchange(String sourceCountry, String destinationCountry, Double amount) {
        this.sourceCountryCode = sourceCountry;
        this.destinationCountryCode = destinationCountry;
        this.exchangeRate = amount;
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

    public double convertFromEuroToDollar(Double amount) {
        return (currencies.get("USD")/currencies.get("EUR"))*amount;
    }

    public double convertFromEuroToBritish(Double amount) {
        return (currencies.get("GBP")/currencies.get("EUR"))*amount;
    }

    public double convertFromPoundToRupee(Double amount) {
        return (currencies.get("INR")/currencies.get("GBP"))*amount;
    }

    public double convertFromRupeeToCanadian(Double amount) {
        return (currencies.get("CAD")/currencies.get("INR"))*amount;
    }

    public double convertFromCanadianToSingapore(Double amount) {
        return (currencies.get("SGD")/currencies.get("CAD"))*amount;
    }

    public double convertFromSingaporeToSwiss(Double amount) {
        return (currencies.get("CHF")/currencies.get("SGD"))*amount;
    }

    public double convertFromSwissToMalaysian(Double amount) {
        return (currencies.get("MYR")/currencies.get("CHF"))*amount;
    }

    public double convertFromMalaysianToJapanese(Double amount) {
        return (currencies.get("JPY")/currencies.get("MYR"))*amount;
    }

    public double convertFromJapaneseToYuan(Double amount) {
        return (currencies.get("CNY")/currencies.get("JPY"))*amount;
    }
}
