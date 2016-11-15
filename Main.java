package com.jetbrains;

import java.util.Scanner;

/**
 * Created by malaw on 10/30/2016.
 */
public class Main {

    public void interaction(){
        System.out.println("- Tip Calculator - ");
        System.out.println("");
        TipCalc tipCalc = new TipCalc();

        System.out.println("please enter your bill in dollars and cents");
        tipCalc.getBill();
        tipCalc.convertBill();
        System.out.println("Please select desired TIP percentage:");
        System.out.println("10%");
        System.out.println("15%");
        System.out.println("20%");
        tipCalc.setTip();

        tipCalc.splitBill();
        tipCalc.restartSession();
    }

    public static void main(String[] args){
            Main mainClass = new Main();
            mainClass.interaction();
    }
}
