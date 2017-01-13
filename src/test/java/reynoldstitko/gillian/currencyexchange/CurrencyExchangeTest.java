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
        Double expected = 83.32;
        Double actual = currencyExchange.calculateExchangeRate("GBP", "INR");
        assertEquals("I expected 83.32", expected, actual, 0.02);
    }

    @Test
    public void convertFromSourceToDestinationRateTest(){
        currencyExchange.calculateExchangeRate("GBP", "INR");
        Double expected = 1249.76;
        Double actual = currencyExchange.convertFromSourceToDestinationRate(15.0);
        assertEquals("I expected 83.32", expected, actual, 0.02);
    }

    @Test
    public void convertFromDollarToEuroTest() {
        Double expected = 0.94;
        Double actual = currencyExchange.convertFromDollarToEuro(1.0);
        assertEquals("I expected 0.94", expected, actual, 0.02);
        //assertEquals("I expected the exchange to be 0.94", expected, actual);
    }

    @Test
    public void convertFromEuroToDollarTest() {
        Double expected = 1.06;
        Double actual = currencyExchange.convertFromEuroToDollar(1.0);
        assertEquals("I expected the Euro to Dollar rate to be 1.06", expected, actual, 0.02);
    }

    @Test
    public void convertFromEuroToBritishTest() {
        Double expected = 0.87;
        Double actual = currencyExchange.convertFromEuroToBritish(1.0);
        assertEquals("I expected the Euro to British pound rate to be 0.87", expected, actual, 0.02);
    }

    @Test
    public void convertFromPoundToRupeeTest() {
        Double expected = 83.32;
        Double actual = currencyExchange.convertFromPoundToRupee(1.0);
        assertEquals("I expected the British pound to Rupee rate to be 83.31", expected, actual, 0.02);
    }
    @Test
    public void convertFromRupeeToCanadianTest() {
        Double expected = 0.02;
        Double actual = currencyExchange.convertFromRupeeToCanadian(1.0);
        assertEquals("I expected the Rupee to Canadian dollar rate to be 0.02", expected, actual, 0.02);
    }

    @Test
    public void convertFromCanadianToSingaporeTest() {
        Double expected = 1.08;
        Double actual = currencyExchange.convertFromCanadianToSingapore(1.0);
        assertEquals("I expected the Canadian dollar to Singapore rate to be 1.08", expected, actual, 0.02);
    }

    @Test
    public void convertFromSingaporeToSwissTest() {
        Double expected = 0.71;
        Double actual = currencyExchange.convertFromSingaporeToSwiss(1.0);
        assertEquals("I expected the Singapore to Swiss franc rate be 0.71", expected, actual, 0.02);
    }

    @Test
    public  void convertFromSwissToMalaysianTest() {
        Double expected = 4.43;
        Double actual = currencyExchange.convertFromSwissToMalaysian(1.0);
        assertEquals("I expected the Malaysian to Swiss franc rate be 4.43", expected, actual, 0.02);
    }

    @Test
    public void convertFromMalaysianToJapaneseTest(){
        Double expected = 25.91;
        Double actual = currencyExchange.convertFromMalaysianToJapanese(1.0);
        assertEquals("I expected the Malaysian to Japanese yen rate be 25.91", expected, actual, 0.02);
    }

    @Test
    public void convertFromJapaneseToYuanTest(){
        Double expected = 0.06;
        Double actual = currencyExchange.convertFromJapaneseToYuan(1.0);
        assertEquals("I expected the Japanese to Chinese yuan rate be 0.06", expected, actual, 0.02);
    }
}
