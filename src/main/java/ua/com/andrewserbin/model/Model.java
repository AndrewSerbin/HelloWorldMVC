package ua.com.andrewserbin.model;

/**
 * Created by admin on 17.07.2017.
 */
public class Model {

    private String firstPart;
    private String secondPart;

    /**
     * Creates a string by adding first part and second part
     * @return string
     */
    public String createString() {
        return firstPart + secondPart;
    }

    public String getFirstPart() {
        return firstPart;
    }

    public void setFirstPart(String firstPart) {
        this.firstPart = firstPart;
    }

    public String getSecondPart() {
        return secondPart;
    }

    public void setSecondPart(String secondPart) {
        this.secondPart = secondPart;
    }
}
