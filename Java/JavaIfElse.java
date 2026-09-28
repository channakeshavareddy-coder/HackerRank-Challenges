import java.util.Scanner;
public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n % 2 != 0){
            System.out.println("Weird");
        } else if(n >= 2 && n <= 5){
            System.out.println("Not Weird");
        } else if(n >= 6 && n <= 20){
            System.out.println("Weird");
        } else if(n > 20){
            System.out.println("Not Weird");
        }
        scan.close();
    }
}
/*
Requirement:
Given a positive integer n, determine whether it is "Weird" or "Not Weird"
using if-else conditional statements.

Conditions:
1. If n is odd, print "Weird".
2. If n is even and in the inclusive range 2 to 5, print "Not Weird".
3. If n is even and in the inclusive range 6 to 20, print "Weird".
4. If n is even and greater than 20, print "Not Weird".

Input:
A single line containing a positive integer n.

Output:
Print "Weird" if the number is weird; otherwise, print "Not Weird".
*/