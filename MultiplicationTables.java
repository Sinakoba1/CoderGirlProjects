package com.company;
import static java.lang.System.out;
import java.util.Scanner;
public class MultiplicationTables
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int size;
        int a;
        int b;
        out.println("Welcome to Multiplication Tables");
        out.print("How large would you like to see them? ");
        size = keyboard.nextInt();
        for (a = 0; a <= size; a++)
        {
            if (a < 10)
            {
                out.print("");
            }
            for (b = 0; b <= size; b++)
            {
                if(size < 20)
                {
                    out.println(a + "*" + b + "=" + a*b);
                }
                 else if (size > 20 || size < 1)
                {
                    out.println("Please choose a number between 1-20.");
                    size = keyboard.nextInt();
                }
            }out.print("");
        }
    }
}