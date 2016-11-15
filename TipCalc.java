package com.jetbrains;

import java.util.Scanner;

/**
 * Created by malaw on 10/30/2016.
 */
public class TipCalc {

    static double currentBill, newBill, additionalTip, billPerPerson;
    double tip, splitNumber, splitPrompt, conversionPrompt, exitPrompt;
    String userAnswer;

    static Scanner inputReader = new Scanner(System.in);
    Main mainClass = new Main();

    public static void getBill() {
        currentBill = inputReader.nextDouble();
        System.out.print("Your bill is: ");
        System.out.println("$"+ currentBill);
    }

    public void setTip() {
        tip = inputReader.nextDouble();
        additionalTip = currentBill*tip/100;
        newBill = currentBill + additionalTip;

        System.out.print("Your new amount is: $");
        System.out.printf("%.2f\n",newBill);
    }

    public void splitBill() {
        System.out.println("would you like to split your bill?");
        System.out.println("Enter 1=Yes or 0=No");
        splitPrompt = inputReader.nextDouble();

        if (splitPrompt == 0) {
            System.out.print("your total is: ");
            System.out.println(newBill);
        }
        if (splitPrompt == 1) {
            System.out.println("on how many people?");
            splitNumber = inputReader.nextDouble();
            billPerPerson = newBill / splitNumber;
            System.out.print("bill for each person: ");
            System.out.printf("%.2f\n",billPerPerson);
        }
    }

    public void convertBill() {
        System.out.println("would you like to convert your total bill to Saudi Riyals? 1=yes or 0=no");
        conversionPrompt = inputReader.nextDouble();

        if (conversionPrompt == 0) {
            System.out.print("your total is: ");
            System.out.println(currentBill);
        }
        if (conversionPrompt == 1) {
            newBill = currentBill * 3.75;
            System.out.print("your bill in Saudi Riyals is: SR");
            System.out.printf("%.2f\n", newBill);

        }

    }

    public void restartSession() {
        System.out.println("would you like to calculate a different bill?");
        System.out.println("enter 1=Yes or 0=No");
        exitPrompt = inputReader.nextDouble();

        if (exitPrompt == 0) {
            System.out.println("thank you for using Tip Calculator");
            System.exit(1);
        }
        if (exitPrompt == 1) {
            System.out.flush();
            mainClass.interaction();
        }
    }
}




