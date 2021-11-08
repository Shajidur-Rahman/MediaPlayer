package com.shajidurrahmansaad.mediaplayer;

public class SoundMain {

    /*
    Here you can add variables as your wish but after adding variables
    you need to add the variables to the constructor and need to declare getter and setter.
    */

    private String firstItem;
    private String secondItem;
    private String thirdItem;


    // constructor
    public SoundMain(String firstItem, String secondItem, String thirdItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
        this.thirdItem = thirdItem;
    }


    // getter and setters
    public String getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(String firstItem) {
        this.firstItem = firstItem;
    }

    public String getSecondItem() {
        return secondItem;
    }

    public void setSecondItem(String secondItem) {
        this.secondItem = secondItem;
    }

    public String getThirdItem() {
        return thirdItem;
    }

    public void setThirdItem(String thirdItem) {
        this.thirdItem = thirdItem;
    }
}