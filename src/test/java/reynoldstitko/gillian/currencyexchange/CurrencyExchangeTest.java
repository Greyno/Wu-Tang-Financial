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
        Double expected = 1.88;
        Double actual = currencyExchange.convertFromDollarToEuro(2.0);
        assertEquals("I expected 1.88", expected, actual, 0.02);
        //assertEquals("I expected the exchange to be 0.94", expected, actual);
    }

    @Test
    public void convertFromEuroToDollarTest() {
        Double expected = 2.12;
        Double actual = currencyExchange.convertFromEuroToDollar(2.0);
        assertEquals("I expected the Euro to Dollar rate to be 2.12", expected, actual, 0.02);
    }

    @Test
    public void convertFromEuroToBritishTest() {
        Double expected = 1.74;
        Double actual = currencyExchange.convertFromEuroToBritish(2.0);
        assertEquals("I expected the Euro to British pound rate to be 1.74", expected, actual, 0.02);
    }

    @Test
    public void convertFromPoundToRupeeTest() {
        Double expected = 166.64;
        Double actual = currencyExchange.convertFromPoundToRupee(2.0);
        assertEquals("I expected the British pound to Rupee rate to be 166.64", expected, actual, 0.02);
    }
    @Test
    public void convertFromRupeeToCanadianTest() {
        Double expected = 0.04;
        Double actual = currencyExchange.convertFromRupeeToCanadian(2.0);
        assertEquals("I expected the Rupee to Canadian dollar rate to be 0.04", expected, actual, 0.02);
    }

    @Test
    public void convertFromCanadianToSingaporeTest() {
        Double expected = 2.16;
        Double actual = currencyExchange.convertFromCanadianToSingapore(2.0);
        assertEquals("I expected the Canadian dollar to Singapore rate to be 2.16", expected, actual, 0.02);
    }

    @Test
    public void convertFromSingaporeToSwissTest() {
        Double expected = 1.42;
        Double actual = currencyExchange.convertFromSingaporeToSwiss(2.0);
        assertEquals("I expected the Singapore to Swiss franc rate be 1.42", expected, actual, 0.02);
    }

    @Test
    public  void convertFromSwissToMalaysianTest() {
        Double expected = 8.86;
        Double actual = currencyExchange.convertFromSwissToMalaysian(2.0);
        assertEquals("I expected the Malaysian to Swiss franc rate be 8.86", expected, actual, 0.02);
    }

    @Test
    public void convertFromMalaysianToJapaneseTest(){
        Double expected = 51.82;
        Double actual = currencyExchange.convertFromMalaysianToJapanese(2.0);
        assertEquals("I expected the Malaysian to Japanese yen rate be 51.82", expected, actual, 0.02);
    }

    @Test
    public void convertFromJapaneseToYuanTest(){
        Double expected = 0.12;
        Double actual = currencyExchange.convertFromJapaneseToYuan(2.0);
        assertEquals("I expected the Japanese to Chinese yuan rate be 0.12", expected, actual, 0.02);
    }
}
