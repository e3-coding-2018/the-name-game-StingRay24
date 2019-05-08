package com.e3civichigh.coding.thenamegame;

public class TheNameGame {
    public static void main(String[] args) {
        String name = "Tristan";

        TheNameGame game = new TheNameGame();
        String song = game.createSong(name);
        System.out.println(song);
    }

    @SuppressWarnings("WeakerAccess")
    public String createSong(String name) {
        String sep = ", ";
        String b = "b";
        String f = "f";
        String m = "m";
        String x = name;
        String y = name.substring(1);
        char letter = name.toLowerCase().charAt(0);
        if ("aeiouAEIOU".indexOf(letter) > -1) {
            y = name.toLowerCase();
        } else if (letter == 'b') {
            b = "";
        } else if (letter == 'f') {
            f = "";
        } else if (letter == 'm') {
            m = "";
        }
        String song = x + sep + x + sep + "bo-" + b + y + "\n";
        song = song + "Banana-fana " + "fo-" + f + y + "\n";
        song = song + "Fee-fi-mo-" + m + y + "\n" + x + "!\n" ;
        return song;


        /*
        Unless your name begins with a vowel (A, E, I, O, U), 'B', 'F' or 'M' you don't have to care about special rules.
        The verse for the name 'Gary' would be like this:
        Gary, Gary, bo-bary
        Banana-fana fo-fary
        Fee-fi-mo-mary
        Gary!

        At the end of every line, the name gets repeated without the first letter: Gary becomes ary
        If we take (X) as the full name (Gary) and (Y) as the name without the first letter (ary) the verse would look like this:
        (X), (X), bo-b(Y)
        Banana-fana fo-f(Y)
        Fee-fi-mo-m(Y)
        (X)!
        */

    }
}
