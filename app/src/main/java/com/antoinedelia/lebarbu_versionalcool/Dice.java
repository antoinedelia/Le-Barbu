package com.antoinedelia.lebarbu_versionalcool;

import java.util.Random;

public class Dice {

    private int value;
    private String path;

    public Dice()
    {
        roll();
    }

    public void roll(){
        Random r = new Random();
        value = r.nextInt(7-1) + 1;
        switch (value){
            case 1:
                path="dice_one";
                break;
            case 2:
                path="dice_two";
                break;
            case 3:
                path="dice_three";
                break;
            case 4:
                path="dice_four";
                break;
            case 5:
                path="dice_five";
                break;
            case 6:
                path="dice_six";
                break;
        }
    }

    public int getValue() {
        return value;
    }

    public String getPath() {
        return path;
    }

}
