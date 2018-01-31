package com.company;
import static java.lang.System.out;
import java.util.Scanner;

class SandwichShop {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        out.println("Checking sales goals. ");
        out.println("The sales goal for veggie sandwiches is 50 ");
        out.print("How many veggie sandwiches were sold today? ");
        int veggiesSoldToday = keyboard.nextInt();
        keyboard.skip("\n");
        if
        (veggiesSoldToday < goalForVeggies) {
            out.println("Fell Short ");
        }
        else  {
            out.println("Made goal for veggies. ");
        }
        out.println("The sales goal for burgers is 250 ");
        out.print("How many burgers were sold today? ");

        int burgersSoldToday = keyboard.nextInt();

        keyboard.skip("\n");
        if (burgersSoldToday < goalForBurgers) {
            out.println("Fell Short ");
        }
        else  {
            out.println("Made goal for burgers. ");
        }
        out.println("The sales goal for subs is 180 ");
        out.print("How many subs were sold today? ");
        int subsSoldToday = keyboard.nextInt();
        keyboard.skip("\n");
        if (subsSoldToday < goalForSubs) {
            out.print("Fell Short ");
        }
        else  {
            out.println("Made goal for subs. ");
        }
        out.println("The sales goal for soup is 70 ");
        out.print("How many soup were sold today? ");
        int soupSoldToday = keyboard.nextInt();
        keyboard.skip("\n");

        if (soupSoldToday < goalForSoup) {
            out.println("Fell Short ");
        }
        else  {
            out.println("Made goal for Soup. ");
        }
        if ((veggiesSoldToday >= goalForVeggies) && (burgersSoldToday >= goalForBurgers) && (subsSoldToday >= goalForSubs)
                && (soupSoldToday >= goalForSoup))
        {
            out.println("Made goal for everything!");
        }


    }

}