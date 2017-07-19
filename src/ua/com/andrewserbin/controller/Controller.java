package ua.com.andrewserbin.controller;

import ua.com.andrewserbin.model.Model;
import ua.com.andrewserbin.view.View;
import java.util.Scanner;

/**
 * Created by admin on 17.07.2017.
 */
public class Controller {

    // Data for validation
    public static final String HELLO = "Hello";
    public static final String WORLD = ",world!";

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    /**
     * Gets data from user. Sends a request to Model. Gets answer from Model.
     * Sends to View Model answer.
     */
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setFirstPart(inputStringValueWithScanner(sc, HELLO));
        model.setSecondPart(inputStringValueWithScanner(sc, WORLD));

        view.printMessage(model.createString());
    }

    /**
     * Gets data from user. Checks inputed data with validation constants.
     * If data isn't correct, sends an error message to View. Input will be
     * repeated until the validation is completed.
     * @param sc
     * @param expectedString
     * @return string
     */
    public String inputStringValueWithScanner(Scanner sc, String expectedString) {
        view.printMessage(view.EXPECTED_STRING + expectedString);
        view.printMessage(view.INPUT_DATA);

        while(!sc.hasNext(expectedString)) {
            view.printMessage(view.WRONG_INPUT + view.INPUT_DATA);

            sc.next();
        }

        return sc.next();
    }
}
