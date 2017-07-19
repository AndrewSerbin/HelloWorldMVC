package ua.com.andrewserbin.view;

/**
 * Created by admin on 17.07.2017.
 */
public class View {

    // Text's constants
    public static final String INPUT_DATA = "Input data: ";
    public static final String WRONG_INPUT = "Wrong input! Repeat please! ";
    public static final String EXPECTED_STRING = "Expected string : ";

    /**
     * Prints message in console.
     * @param message
     */
    public void printMessage(String message){
        System.out.println(message);
    }
}
