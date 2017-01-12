package reynoldstitko.gillian.currencyexchange;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gillianreynolds-titko on 1/12/17.
 */
public class CurrencyExchangeTest {
    CurrencyExchange currencyExchange;

    @Before
    public void setUp(){
        currencyExchange = new CurrencyExchange();
    }

    @Test
    public void calculateExchangeRateTest(){
        Double expected = 0.94;
        Double actual = currencyExchange.calculateExchangeRate("USD", "EUR");
        assertEquals("I expected 0.94", expected, actual, 0.02);
    }

    @Test
    public void convertFromDollarToEuroTest() {
        Double expected = 0.94;
        Double actual = currencyExchange.convertFromDollarToEuro("USD", "EUR");
        assertEquals("I expected 0.94", expected, actual, 0.02);
        //assertEquals("I expected the exchange to be 0.94", expected, actual);
    }

    @Test
    public void convertFromEuroToDollarTest() {
        Double expected = 1.06;
        Double actual = currencyExchange.convertFromEuroToDollar("EUR", "USD");
        assertEquals("I expected the Euro to Dollar rate to be 1.06", expected, actual, 0.02);
    }

    @Test
    public void convertFromEuroToBritish() {
        Double expected = 0.87;
        Double actual = currencyExchange.convertFromEuroToBritish("EUR", "GBP");
        assertEquals("I expected the Euro to British pound rate to be 0.87", expected, actual, 0.02);
    }

    @Test
    public void convertFromPoundToRupee() {
        Double expected = 83.32;
        Double actual = currencyExchange.convertFromPoundToRupee("GBP", "INR");
        assertEquals("I expected the British pound to Rupee rate to be 83.31", expected, actual, 0.02);
    }
    @Test
    public void convertFromRupeeToCanadian() {
        Double expected = 0.02;
        Double actual = currencyExchange.convertFromPoundToRupee("GBP", "INR");
        assertEquals("I expected the Rupee to Canadian dollar rate to be 0.02", expected, actual, 0.02);
    }
}
