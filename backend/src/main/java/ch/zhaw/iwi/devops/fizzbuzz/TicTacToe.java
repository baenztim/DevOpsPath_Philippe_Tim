package ch.zhaw.iwi.devops.fizzbuzz;

import java.util.Scanner;

public class TicTacToe {
    public static char[][] spielfeld = new char[3][3];
    public static int Zeile;
    public static final int Spalte;
    public static char temp;
    public static int position;

    public static void javagame() {

        Scanner keyScan = new Scanner(System.in);
        System.out.println("Let's Play Tic Tac Toe");
        init();
        printSpielfeld();
        boolean spielerX = true;
        for (int i = 0; i < 9; i++) {
            System.out.print("SpielerIn " + getSymbol(spielerX) + ": ");
            int position = keyScan.nextInt();
            getZeile(position);
            getSpalte(position);
            speichere(spielerX);
            spielerX = !spielerX;
            printSpielfeld();

        }
        keyScan.close();
    }

    static void init() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                spielfeld[i][j] = '.';
            }

        }
    }

    static void speichere(boolean spielerX) {
        if (spielerX == true) {
            temp = 'X';
        } else {
            temp = 'O';
        }
        if (Zeile == 0 && Spalte == 0) {
            spielfeld[0][0] = temp;
        }
        if (Zeile == 1 && Spalte == 0) {
            spielfeld[1][0] = temp;
        }
        if (Zeile == 2 && Spalte == 0) {
            spielfeld[2][0] = temp;
        }
        if (Zeile == 0 && Spalte == 1) {
            spielfeld[0][1] = temp;
        }
        if (Zeile == 1 && Spalte == 1) {
            spielfeld[1][1] = temp;
        }
        if (Zeile == 2 && Spalte == 1) {
            spielfeld[2][1] = temp;
        }
        if (Zeile == 0 && Spalte == 2) {
            spielfeld[0][2] = temp;
        }
        if (Zeile == 1 && Spalte == 2) {
            spielfeld[1][2] = temp;
        }
        if (Zeile == 2 && Spalte == 2) {
            spielfeld[2][2] = temp;
        }
    }

    static char getSymbol(boolean spielerX) {
        if (spielerX == true) {
            char player1 = 'X';
            return player1;
        } else {
            char player2 = 'O';
            return player2;
        }
    }

    public static void getZeile(int position) {
        if (position > 0 && position < 4) {
            Zeile = 0;
        }
        if (position > 3 && position < 7) {
            Zeile = 1;
        }
        if (position > 7 && position < 10) {
            Zeile = 2;
        }
    }


    public static void getSpalte(int position) {
        if (position == 1 || position == 4 || position == 7) {
            Spalte = 0;
        }
        if (position == 2 || position == 5 || position == 8) {
            Spalte = 1;
        }
        if (position == 3 || position == 6 || position == 9) {
            Spalte = 2;
        }
    }

    static void printSpielfeld() {
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(spielfeld[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
