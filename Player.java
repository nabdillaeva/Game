package com.company;

import java.util.Random;
import java.util.Scanner;

public class Player implements Dice_able {
     int playerDice;

    Random random = new Random();
    @Override
    public int method() {
        for (int i = 0; i < 1; i++) {
            playerDice= random.nextInt((6-1)+1)+1;
            switch (playerDice){
                case 1:
                    System.out.println("\n+-------+\n" +
                            "|       |\n" +
                            "|   #   |\n" +
                            "|       |\n" +
                            "+-------+");
                    break;
                case 2:
                    System.out.println("\n+-------+\n" +
                            "| #     |\n" +
                            "|       |\n" +
                            "|     # |\n" +
                            "+-------+");
                    break;
                case 3:
                    System.out.println("\n+-------+\n" +
                            "| #     |\n" +
                            "|   #   |\n" +
                            "|     # |\n" +
                            "+-------+");
                    break;
                case 4:
                    System.out.println("\n+-------+\n" +
                            "| #   # |\n" +
                            "|       |\n" +
                            "| #   # |\n" +
                            "+-------+");
                    break;
                case 5:
                    System.out.println("\n+-------+\n" +
                            "| #   # |\n" +
                            "|   #   |\n" +
                            "| #   # |\n" +
                            "+-------+");
                    break;
                case 6:
                    System.out.println("\n+-------+\n" +
                            "| #   # |\n" +
                            "| #   # |\n" +
                            "| #   # |\n" +
                            "+-------+");
                    break;

            }
        }
        return playerDice;
    }

}

