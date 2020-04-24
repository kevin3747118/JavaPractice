package com.alzk;

//public class Main {
//
//    private static final int simCardSize4G = 128; // 假設 5G Sim Card 大小為 128;
//    private static final int simCardSize5G = 64; // 肉眼觀測 4G Sim Card 大小為 5G Sim Card 的一半;
//    private static final int simCardSize = 16; // 他媽還是用肉眼觀測，4G Sim Card 大小為 16 (4G Sim Card 的四分之一);
//    private static final int simCardSize2 = simCardSize; // 他媽再用肉眼觀測，4G Sim Card 跟 5G Sim Card 一樣大;
//    public static final byte simCard4GPlasticArea = simCardSize4G - simCardSize; // 4G 卡片的塑膠區域
//    public static final byte simCard5GPlasticArea = simCardSize5G - simCardSize; // 5G 卡片的塑膠區域
//
//    public static void main(String[] args) {
//        System.out.println("結論");
//        System.out.println("4G Sim Card - 總大小：" + simCardSize4G + ", Sim Card 區域為：" + simCardSize + ", 塑膠區域為:" + simCard4GPlasticArea);
//        System.out.println("5G Sim Card - 總大小：" + simCardSize5G + ", Sim Card 區域為：" + simCardSize + ", 塑膠區域為:" + simCard5GPlasticArea);
//        if (simCard5GPlasticArea < simCard4GPlasticArea) { // 比較卡片的塑膠區域
//            System.out.println("幹 Sim Card 本身沒有變小，是 Sim Card 沒拔下前連著的那塊板子變小！象徵 2G 到 5G 演變進程，也更加簡約環保。");
//        } else if (simCardSize < simCardSize2) { // 比較 Sim Card 大小
//            System.out.println("你很奇怪，比較 Sim Card 幹嘛？");
//        } else {
//            System.out.println("不能質疑 Jammie，因為他五歲開始寫程式。");
//        }
//    }
//}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Wall a = new Wall(-1.25, -1.25);
        System.out.println(a.getArea());
    }

//    public static void main(String[] args) {
//        int count = 0;
//        int value = 0;
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Enter number #" + (count + 1));
//            if (scanner.hasNextInt()) {
//                value = scanner.nextInt();
//                count++;
//                value += count;
//                if (count == 5) {
//                    scanner.close();
//                    break;
//                }
//            } else {
//                System.out.println("You enter the wrong type value ! Try again.");
//            }
//            scanner.nextLine();
//        }
//        System.out.println("Total: " + value);
////        scanner.next();
////        System.out.println("Enter the fking number");
////        if (scanner.hasNextInt()) {
////            System.out.println("You enter: " + scanner.nextLine());
////            scanner.close();
////        } else {
////            scanner.nextLine();
////            System.out.println("Fk ! Type again !");
////        }
//        //        System.out.println("Enter your name: ");
//        //        String name = scanner.nextLine();
//        //        System.out.println(name);
//
//    }

    //    public static boolean isEvenNumber(int a) {
    //        return a % 2 == 0;
    //    }

    //    public static void main(String[] args) {
    //
    //        int number = 4;
    //        int count = 0;
    //        int totalValue = 0;
    //
    //        while (number <= 20 && count != 5) {
    //            number++;
    //            if (!isEvenNumber(number)) {
    //                continue;
    //            }
    //            count++;
    //            totalValue += number;
    //        }
    //        System.out.println(totalValue + count);
    //
    //        //        System.out.println(isEvenNumber(6));
    //
    //        //        int count = 1;
    //        //        do {
    //        //            System.out.println("幹");
    //        //            count++;
    //        //        } while (count != 6);
    //
    //        //        while (count != 6) {
    //        //            System.out.println(count);
    //        //            count += 1;
    //        //        }
    //    }

    //    public static void main(String[] args) {
    //        int findCounts = 0;
    //        int findValue = 0;
    //        for (int i = 1; i <= 1000; i++) {
    //            if (i % 3 == 0 && i % 5 ==0) {
    //                findCounts += 1;
    //                findValue += i;
    //                System.out.println(i);
    //                if (findCounts == 5) {
    //                    break;
    //                }
    //            }
    //        }
    //        System.out.println("幹: " + findValue);
    //    }

    //    public static void main(String[] args) {
    //        SimCard a = new SimCard(SimCard.CardType.card4G, 128);
    //        SimCard b = new SimCard(SimCard.CardType.card5G, 64);
    //        System.out.println(a.type + " 塑膠區域大小為: " + a.getCardPlasticSize());
    //        System.out.println(b.type + " 塑膠區域大小為: " + b.getCardPlasticSize());
    //
    //    }

    //    public static void main(String[] args) {
    //        int switchValue = 1;
    //        switch (switchValue) {
    //            case 1:
    //                System.out.println("Value was 1");
    //                break;
    //            case 2:
    //                System.out.println("Value was 2");
    //                break;
    //            case 4: case 5: case 6:
    //                System.out.println("567");
    //                break;
    //            default:
    //                System.out.println("Strange");
    //                break;
    //        }
    //    }

    //    public static String getDurationString(int seconds) {
    //        if (seconds < 0) {
    //            return INVALID_VALUE_MESSAGE;
    //        }
    //        int remainMinutes = seconds / 60;
    //        int remainSeconds = seconds % 60;
    //        return getDurationString(remainMinutes, remainSeconds);
    //    }
    //
    //    public static String getDurationString(int minutes, int seconds) {
    //        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
    //            return INVALID_VALUE_MESSAGE;
    //        }
    //        int remainMinutes = minutes % 60;
    //        int hours = minutes / 60;
    //        return hours + "h " + remainMinutes + "m " + seconds + "s";
    //    }

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
