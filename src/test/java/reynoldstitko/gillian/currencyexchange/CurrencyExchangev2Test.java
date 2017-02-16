package reynoldstitko.gillian.currencyexchange;

import org.junit.Test;
import reynoldstitko.gillian.currencyexchange.reynoldstitko.CurrencyExchangev2;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by gillianreynolds-titko on 2/16/17.
 */
public class CurrencyExchangev2Test {
    CurrencyExchangev2 currencyExchangev2 = new CurrencyExchangev2();

    @Test
    public void currencyConverterTest(){
        Double amountToExchange = 5.00; //yen to Canadian dollars
        Double expected = 0.06;
        double actual = currencyExchangev2.convert("JPY", "CAD", 5.0);
        assertEquals("expect to get 0.06", expected, actual, 0.005);
        assertEquals(expected, Double.parseDouble(currencyExchangev2.convert(5.00, "JPY", "CAD")));
    }

    @Test
    public void convertUSDEURTest(){ //USD to EUR
        Double amountToExchange = 7.82;
        Double expected = 7.35;
        double actual = currencyExchangev2.convert("USD", "EUR", 7.82);
        assertEquals("expect to get 0.06", expected, actual, 0.005);
        assertEquals(expected, Double.parseDouble(currencyExchangev2.convert(7.82, "USD", "EUR")));
    }

    @Test
    public void convertEURUSDTest(){ //EUR to USD
        Double amountToExchange = 1015.35;
        Double expected = 1080.16;
        double actual = currencyExchangev2.convert("EUR", "USD", 1015.35);
        assertEquals("expect to get 0.06", expected, actual, 0.005);
        assertEquals(expected, Double.parseDouble(currencyExchangev2.convert(1015.35, "EUR", "USD")));

    }

    @Test
    public void convertEURGBPTest(){ //EUR to GBP
        Double amountToExchange = 78.0;
        Double expected = 68.04;
        double actual = currencyExchangev2.convert("EUR", "GBP", 78.0);
        assertEquals("expect to get 0.06", expected, actual, 0.005);
        assertEquals(expected, Double.parseDouble(currencyExchangev2.convert(78.0, "EUR", "GBP")));
    }

    @Test
    public void convertGBPINRTest(){ //GBP to INR
        Double amountToExchange = 1000.00;
        Double expected = 83317.07;
        double actual = currencyExchangev2.convert("GBP", "INR", 1000.0);
        assertEquals("expect to get 0.06", expected, actual, 0.005);
        assertEquals(expected, Double.parseDouble(currencyExchangev2.convert(1000.0, "GBP", "INR")));
    }

    @Test
    public void convertINRCADTest(){ //INR to CAD
        Double amountToExchange = 15000.00;
        Double expected = 289.81;
        double actual = currencyExchangev2.convert("INR", "CAD", 15000.0);
        assertEquals("expect to get 0.06", expected, actual, 0.005);
        assertEquals(expected, Double.parseDouble(currencyExchangev2.convert(15000.0, "INR", "CAD")));
    }

    @Test
    public void convertCADSGDTest(){ //CAD to SGD
        Double amountToExchange = 150.00;
        Double expected = 162.50;
        double actual = currencyExchangev2.convert("CAD", "SGD", 150.0);
        assertEquals("expect to get 0.06", expected, actual, 0.005);
        assertEquals(expected, Double.parseDouble(currencyExchangev2.convert(150.0, "CAD", "SGD")));
    }

    @Test
    public void convertSGDCHFTest(){ //SGD to CHF
        Double amountToExchange = 75.00;
        Double expected = 52.97;
        double actual = currencyExchangev2.convert("SGD", "CHF", 75.0);
        assertEquals("expect to get 0.06", expected, actual, 0.005);
        assertEquals(expected, Double.parseDouble(currencyExchangev2.convert(75.0, "SGD", "CHF")));
    }

    @Test
    public void convertCHFMYRTest(){ //CHF to MYR
        Double amountToExchange = 250.00;
        Double expected = 1106.44;
        double actual = currencyExchangev2.convert("CHF", "MYR", 250.0);
        assertEquals("expect to get 0.06", expected, actual, 0.005);
        assertEquals(expected, Double.parseDouble(currencyExchangev2.convert(250.0, "CHF", "MYR")));
    }

    @Test
    public void convertMYRJPYTest(){ //MYR to JPY
        Double amountToExchange = 1250.00;
        Double expected = 32393.74;
        double actual = currencyExchangev2.convert("MYR", "JPY", 1250.0);
        assertEquals("expect to get 0.06", expected, actual, 0.005);
        assertEquals(expected, Double.parseDouble(currencyExchangev2.convert(1250.0, "MYR", "JPY")));
    }

    @Test
    public void convertJPYCNYTest(){ //JPY to CNY
        Double amountToExchange = 890.00;
        Double expected = 34.34;
        double actual = currencyExchangev2.convert("JPY", "MYR", 890.0);
        assertEquals("expect to get 0.06", expected, actual, 0.005);
        assertEquals(expected, Double.parseDouble(currencyExchangev2.convert(890.0, "JPY", "MYR")));
    }
}
