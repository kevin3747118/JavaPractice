package com.alzk;

public class MegaBytesConverter {

//    public static String toKB(int kiloBytes) {
//        return kiloBytes + " KB = " + Math.round(kiloBytes / 1024) + " MB and " + Math.round(kiloBytes % 1024) + " KB";
//    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + Math.round(kiloBytes / 1024) + " MB and " + Math.round(kiloBytes % 1024) + " KB");
        }
    }

}
