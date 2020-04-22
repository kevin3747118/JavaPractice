package com.alzk;

import javax.xml.stream.XMLInputFactory;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    private static String INVALID_VALUE_MESSAGE2 = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int remainMinutes = seconds / 60;
        int remainSeconds = seconds % 60;
        return getDurationString(remainMinutes, remainSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        int remainMinutes = minutes % 60;
        int hours = minutes / 60;
        return hours + "h " + remainMinutes + "m " + seconds + "s";
    }

    //    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    //        if (feet < 0 || (inches < 0 || inches > 12)) { return -1; }
    //        double centimeters = (feet * 12) * 2.54;
    //        centimeters += inches * 2.54;
    //        return centimeters;
    //    }
    //
    //    public static double calcFeetAndInchesToCentimeters(double inches) {
    //        if (inches < 0) { return -1; }
    //        double feet = (int) inches / 12;
    //        double remainingInches = (int) inches & 12;
    //        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    //    }

    //    public static void main(String[] args) {
    ////        boolean gameOver = true;
    ////        int score = 800;
    ////        int levelCompleted = 5;
    ////        int bonus = 100;
    ////        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    ////        System.out.println("Your final score: " + highScore);
    //        int highScorePosition = calculateHighScorePosition(1500);
    //        displayHighScorePosition("Tim", highScorePosition);
    //        highScorePosition = calculateHighScorePosition(900);
    //        displayHighScorePosition("Bob", highScorePosition);
    //    }
    //
    //    public static void displayHighScorePosition(String name, int position) {
    //        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    //    }
    //
    //    public static int calculateHighScorePosition(int score) {
    //        if (score >= 1000) {
    //            return 1;
    //        } else if (score >= 500) {
    //            return 2;
    //        } else if (score >= 100) {
    //            return 3;
    //        }
    //        return 4;
    //    }
    //
    //    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    //
    //        if (gameOver) {
    //            int finalScore = score + (levelCompleted * bonus);
    //            finalScore += 1000;
    //            return finalScore;
    //        }
    //        return -1;
    //    }

    //    public static void main(String[] args) {
    //        boolean gameIsOver = false;
    //        int score = 5000;
    //        if (gameIsOver) {
    //            System.out.println("G");
    //        } else {
    //            System.out.println("WTF...");
    //        }
    //    }

    //    public static void main(String[] args) {
    //
    //        double myFirstValue = 20.00d;
    //        double mySecondValue = 80.00d;
    //        double myTotal = (myFirstValue + mySecondValue) * 100.00d;
    //        double myRemainder = myTotal % 40.00d;
    //        boolean isZero = (myRemainder == 0) ? true : false;
    //
    //        if (!isZero) {
    //            System.out.println("Got some remainder");
    //        }


    //        double myDoubleValue1 = 20;
    //        double myDoubleValue2 = 80;
    //        double myDoubleValue3 = (myDoubleValue1 + myDoubleValue2) * 100;
    //        double myDoubleValue4 = (myDoubleValue1 + myDoubleValue2) * 40;
    //        boolean isZero = myDoubleValue3 % 4 == 0 ? true : false;
    //        System.out.println("幹 " + isZero);


    //        boolean isCar = true;
    //        boolean wasCar = isCar ? true : false;

    //        int newValue = 50;
    //        if (newValue == 50) {
    //            System.out.println("幹");
    //        }

    //        boolean isAlien = false;
    //        if (isAlien == false) {
    //            System.out.println("詭異");
    //        }
    //
    //        int topScore = 100;
    //        if (topScore != 100) {
    //            System.out.println("You got a high score");
    //        } else {
    //            System.out.println("e04");
    //        }

    //        int result = 1 + 2; // 1 + 2 = 3
    //        result *= 10;
    //        System.out.println(result);

    //        String myString ="Hello world";
    //        myString += " 幹";
    //        System.out.println(myString + " \u00A9");
    //
    //        String numberString = "250.44";
    //        numberString = "GGGG";
    //        System.out.println(numberString);

    //        char myChar = 'D';
    //        char myUnicodeChar = '\u0044';
    //        boolean haha = true;
    //        boolean haha2 = false;
    //
    //        System.out.println(myUnicodeChar);

    //        int pounds = 200;
    //        double kilogram = pounds * 0.45359237d;
    //        System.out.println(kilogram);

    //        float fMin = Float.MIN_VALUE;
    //        float fMax = Float.MAX_VALUE;
    //        System.out.println(fMin);
    //        System.out.println(fMax);
    //
    //        double dMin = Double.MIN_VALUE;
    //        double dMax = Double.MAX_VALUE;
    //        System.out.println(dMin);
    //        System.out.println(dMax);
    //
    //        float myFloatValue = 5.25f;

    //        byte myByte = 10;
    //        short myShort = 111;
    //        int myInt = 20;
    //        long myLong = 50000 + 10L * (myByte + myShort + myInt);
    //        short shortTotal = (short) (50000 + 10L * (myByte + myShort + myInt));
    //        System.out.println(myLong);
    //    }
}
