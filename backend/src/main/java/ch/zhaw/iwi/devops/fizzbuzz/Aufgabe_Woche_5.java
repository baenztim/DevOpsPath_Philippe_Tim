package ch.zhaw.iwi.devops.fizzbuzz;

public class Aufgabe_Woche_5 {
    public String schnappszahl(int zahl) {
        int firstDigit = Integer.parseInt(Integer.toString(zahl).substring(0, 1));
        int secondDigit = Integer.parseInt(Integer.toString(zahl).substring(1, 2));
        
        if (firstDigit == secondDigit){
            return "Schnappszahl";
        }
        else {
            return "Keine Schnappszahl";
        }

        }
    }
