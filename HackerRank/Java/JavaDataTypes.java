/*
 - Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):
 -
 - A byte is an 8-bit signed integer.
 - A short is a 16-bit signed integer.
 - An int is a 32-bit signed integer.
 - A long is a 64-bit signed integer.
 - Given an input integer, you must determine which primitive data types are capable of properly storing that input.
 -
 - To get you started, a portion of the solution is provided for you in the editor.
 -
 - Input Format
 -
 - The first line contains an integer, T, denoting the number of test cases.
 - Each test case, T, is comprised of a single line with an integer,n, which can be arbitrarily large or small.
 -
 - Output Format
 -
 - For each input variable n and appropriate primitive dataType, you must determine if the given primitives are capable of storing it. If yes, then print:
 -
 - n can be fitted in:
 - * dataType
 - If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.:byte < short < int < long ).
 -
 - If the number cannot be stored in one of the four aforementioned primitives, print the line:
 -
 - n can't be fitted anywhere.*/

import java.util.Scanner;
class JavaDataTypes {
    public static void main(String []argh)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for(int i = 0; i< t; i++)

        {
            try {
                long num = scan.nextLong();
                System.out.println(num + " can be fitted in:");
                if(num >= -128 && num <= 127){
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if( num >= -32768 && num <= 32767){
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if(num >= -2147483648 && num <= 2147483647){
                    System.out.println("* int");
                    System.out.println("* long");
                } else if(num >= -9223372036854775808l && num <= 9223372036854775807l){
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(scan.next()+" can't be fitted anywhere.");
            }
        }
        scan.close();
    }
}