package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        String userInput = "";
        int score = 0;

        do {
            int x = 1 + r.nextInt(6);
            int y = 1 + r.nextInt(6);


            System.out.println("Welcome! Let's Play Roll Dice! ");
            System.out.println("Your rolls " + x + " & " + y);

            if (x == 1 && y == 1) {
                score += 25;
                System.out.println("Score:" + score);
            } else if (x == 1 || y == 1) {
                score += 0;
                System.out.println("Score:" + score);
            } else {
                score = +x + y;
                System.out.println("Score:" + score);


                System.out.print("Roll again? ");
                userInput = input.next();

                System.out.println();

            }

        }while (score <= 100 && userInput.equalsIgnoreCase("yes")) ;
        if (score >= 100) {
            System.out.println("You have scored over 100");
        }

        System.out.println("Thank you for playing!");


    }

}
