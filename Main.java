package com.company;
import static java.lang.System.out;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String item1;
        String item2;
        String item3;

        out.println("Please list three items on your grocery shopping list.");
        out.print("Item 1? ");
        item1 = keyboard.nextLine();
        out.print("Item 2? ");
        item2 = keyboard.nextLine();
        out.print("Item 3? ");
        item3  = keyboard.nextLine();

        int item1Count;
        int item2Count;
        int item3Count;

        out.println("Now, please enter the quantity of each item.");
        out.print("How many " + item1 + "? " );
        item1Count = keyboard.nextInt();
        out.print("How many " + item2 + "? " );
        item2Count = keyboard.nextInt();
        out.print("How many " + item3 + "? " );
        item3Count = keyboard.nextInt();

        float item1Price;
        float item2Price;
        float item3Price;

        out.println("Now, please enter the price of each item. ");
        out.print("How much does one " + item1 + " cost? " );
        item1Price = keyboard.nextFloat();
        out.print("How much does one " + item2 + " cost? " );
        item2Price = keyboard.nextFloat();
        out.print("How much does one " + item3 + " cost? " );
        item3Price = keyboard.nextFloat();

        float item1Cost = item1Count * item1Price;
        float item2Cost = item2Count * item2Price;
        float item3Cost = item3Count * item3Price;
        out.println("Calculating your grocery bill. ");
        out.print("Your total cost is " + (item1Cost + item2Cost + item3Cost) );




    }
}
