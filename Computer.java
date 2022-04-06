package com.company;

import java.util.Random;

public class Computer implements Dice_able{
    Random random = new Random();
    int compDice=0;

    public int method(){
        for (int i = 0; i < 1; i++) {
            compDice= random.nextInt((6-1)+1)+1;
            switch (compDice){
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
        return compDice;
    }
}
