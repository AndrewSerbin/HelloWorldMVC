package ua.com.andrewserbin.view;

/**
 * Created by admin on 17.07.2017.
 */
public class View {

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
}
