package reynoldstitko.gillian.currencyexchange.reynoldstitko;

import java.util.Arrays;

/**
 * Created by gillianreynolds-titko on 2/16/17.
 */
public class Main {
    public static void main(String[] args) {
        CurrencyExchangev2 currencyExchangev2  = new CurrencyExchangev2();
        InputOutput inputOutput = new InputOutput();

        String[] input = inputOutput.getString("Enter your currency conversion request in the following format: \n " +
        " [amount] [fromCountry] [toCountry] eg \n   490        GBP            CNY");
//
        System.out.println(Arrays.toString(input));

        String result = currencyExchangev2.convert(Double.parseDouble(input[0]), input[1], input[2]);
        System.out.println(result);
    }
}
