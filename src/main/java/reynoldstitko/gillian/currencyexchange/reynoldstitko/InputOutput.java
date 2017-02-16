package reynoldstitko.gillian.currencyexchange.reynoldstitko;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by gillianreynolds-titko on 2/16/17.
 */
public class InputOutput {

    public Double getDouble(String message){
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public String[] getString(String message){
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        String[] captured = new String[3];
        String inputUserString = sc.nextLine();
        captured[0] = Double.toString(parseAmount(inputUserString));
        captured[1] = parseFromCountry(inputUserString).replace(" ", "");
        captured[2] = parseToCountry(inputUserString).replace(" ", "");
        return captured;
    }

    private double parseAmount(String userInput){
        return Double.parseDouble(userInput.split(" ")[0]);
    }

    private String parseFromCountry(String userInput){
        return userInput.split(" ")[1];
    }

    private String parseToCountry(String userInput){
        return userInput.split(" ")[2];
    }
}

