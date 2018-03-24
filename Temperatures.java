package com.company;
import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;
public class Temperatures
{
    public static void main(String[] args)
    {
        out.println("Temperature Calculator\n");
        out.println("The data provided are:");
        String[] time = {"7 AM", "3 PM", "7 PM", "3 AM"};
        String[] day = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int[][] temps = new int[4][7];
        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;
        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;
        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;
        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;
        int row;
        int column;
        int sum = 0;
        int average = 0;
        for (row = 0; row < time.length; row++)
        {
            out.print(time[row] + ": ");
            for(column = 0; column < temps[row].length; column++)
            {
                out.print(temps[row][column]+ ", ");
            }out.println();
        }
        out.println("\nBased on that data, the following are the average temperatures for the week.\n");
        for(column = 0; column < day.length; column++)
        {
            for (row = 0; row < temps.length; row++)
            {
            sum += temps[row][column];
            }
            average = sum/ temps.length;
            sum = 0;
            out.print(day[column] + ": ");
            out.println(average + " ");
        }out.println();
        for (row = 0; row < time.length; row++)
        {
            for (column = 0; column < temps.length; column++)
            {
                sum += temps[row][column];
            }
            average = sum/ temps.length;
            sum = 0;
            out.print(time[row] + ": ");
            out.println(average + " ");
        }out.println();
        for (column = 0; column < temps.length; column++)
        {
            for (row = 0; row < temps.length; row++)
            {
                sum += temps[row][column];
            }
            average = sum/ temps.length;
            sum = 0;
        }
        out.println("\nThe final average temperature for the week was");
        out.println("Overall: " + average);
        }
    }

