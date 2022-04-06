package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dice {
    public void level3() {
        Player player = new Player();
        Player player1 = new Player();
        Computer computer = new Computer();
        Computer computer1 = new Computer();
        List<Integer> playPd = new ArrayList<>();
        List<Integer> playDc = new ArrayList<>();
        List<Integer> playRt = new ArrayList<>();
        List<Integer> compPd = new ArrayList<>();
        List<Integer> compDc = new ArrayList<>();
        List<Integer> compRt = new ArrayList<>();

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int compCounter = 0;

        System.out.println("-----------START GAME------------");

        for (int i = 0; i < 3; i++) {
            System.out.println("2den 12ge cherinki sandardy ber: ");
            int y = sc.nextInt();
            playPd.add(y);

            System.out.println("Dice'tar yrgytyldy...");
            int x = player.method() + player1.method();
            playDc.add(x);
            System.out.printf("On the dice fell: " + x + " points");

            int result = x - Math.abs(x - y) * 2;
            playRt.add(result);
            System.out.println("\nResult is: " + x + " - abs(" + x + " - " + y + ")*2: " + result + " points");
            counter += result;

            System.out.println("\n----------COMPUTER'S QUEUE-------------------\n");
            System.out.println("2den 12ge cherinki sandardy  Computer beret: ");
            int comptonKutulgonSan = random.nextInt((12 - 2) + 1) + 2;
            compPd.add(comptonKutulgonSan);

            System.out.println("Comp bergen san: " + comptonKutulgonSan);
            System.out.println("Dice'tar yrgytyldy...");
            int compUpay = computer1.method() + computer.method();
            compDc.add(compUpay);

            System.out.println("On the dice fell: " + compUpay + " points");
            int compResult = compUpay - Math.abs(compUpay - comptonKutulgonSan) * 2;
            compRt.add(compResult);
            System.out.println("\nCompRusult is: " + compUpay + " - abs(" + compUpay + " - " + comptonKutulgonSan + ")*2: " + compResult + " points\n");
            compCounter += compResult;

            System.out.println("---------Current score--------");
            System.out.println("Player: " + result);
            System.out.println("Computer: " + compResult);
            if (result > compResult) {
                int point = result - compResult;
                System.out.println("Player is ahead by " + point + " points!");
            } else if (result < compResult) {
                int point1 = compResult - result;
                System.out.println("Computer is ahead by " + point1 + " points!");
            } else {
                System.out.println("Player jana Computer'din upaylary barabar!");
            }
            System.out.println("==========================================================");

        }

            System.out.println("---------------------------Finish Game--------------------");
            System.out.println(" Round       |        User    |         Computer         |");
            System.out.println("-------------+----------------+---------------------------");
            for(int j = 0;  j< 3;j++) {
                System.out.printf("             | Predicted:    %d  | Predicted:         %d\n" +
                                "      %d      | Dice:         %d |  Dice:              %d\n" +
                                "             | Result:       %d | Result:            %d\n", playPd.get(j), compPd.get(j), j,
                        playDc.get(j), compDc.get(j), playRt.get(j), compRt.get(j));
            }
                System.out.printf("-------------+----------------+---------------------------\n"+
                            "    Total    | Points:      %d |  Points:           %d",counter,compCounter);
            if(counter >compCounter) {
                int point = counter - compCounter;
                System.out.println("User win " + point + " points more. Congratulation!\n");
            } else if(counter<compCounter){
                int point1 = compCounter - counter;
                System.out.println("\nComputer win " + point1 + " points more. Congratulation!\n");
            } else {
                System.out.println("Player jana Computer'din upaylary barabar!");
            }
    }
}
