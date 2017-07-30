package ua.com.andrewserbin.view;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by admin on 17.07.2017.
 */
public class View {

    private ResourceBundle bundle = ResourceBundle.getBundle("input",
            new Locale("eu", "EU"));

    /**
     * Prints message in console.
     * @param message
     */
    public void printMessage(String message){
        System.out.println(message);
    }

    /**
     * Concat and prints message in console.
     * @param messages
     */
    public void printMessage(String... messages) {
        StringBuilder builder = new StringBuilder();

        for (String message :
                messages) {
            builder.append(message);
        }

        System.out.println(builder);
    }

    public ResourceBundle getBundle() {
        return bundle;
    }

    public void setBundle(ResourceBundle bundle) {
        this.bundle = bundle;
    }
}
