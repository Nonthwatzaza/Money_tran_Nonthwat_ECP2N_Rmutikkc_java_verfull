package com.Nonthwatzaza.ECP;
import java.text.NumberFormat;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        NumberFormat formatter = new DecimalFormat("#0.000");

        Scanner input = new Scanner(System.in);

        double THB, JPY = 0.3035, USD = 33.24, GBP = 43.15;
        int select;
        double JPYT,USDT,GBPT;
        System.out.print("Specify amount (THB):");
        THB = input.nextFloat();
        System.out.println("1 : USD \n");
        System.out.println("2 : JPY: \n");
        System.out.println("3 : GBP: \n");
        System.out.println("Please select a currency :");
        select = input.nextInt();
        {
            switch (select) {
                case 1:
                    USDT = (THB / USD);
                    System.out.print(formatter.format(THB));
                            System.out.print("THB=");
                            System.out.print(formatter.format(USDT));
                                    System.out.print("USD");
                break;

                case 2:
                    JPYT = THB / JPY;
                    System.out.print(formatter.format(THB));
                            System.out.print("THB=");
                    System.out.print(formatter.format(JPYT));
                            System.out.print("JPY");
                break;
                case 3:
                    GBPT=THB/GBP;
                    System.out.print(formatter.format(THB));
                            System.out.print("THB=");
                    System.out.print(formatter.format(GBPT));
                            System.out.print("GBP");
                break;
            }
        }
    }
}
