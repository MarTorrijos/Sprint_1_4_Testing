package org.Level_2.ejercici_6;

public class arrayException {

    private static String[] myList = new String[5];

    public static void setUp(){
        myList[0] = "Café";
        myList[1] = "Arroz";
        myList[2] = "Tofu";
    }

    public static String getIndexAtPosition(int index) {
        return myList[index];
    }

}