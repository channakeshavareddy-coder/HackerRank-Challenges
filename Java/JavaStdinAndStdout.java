import java.util.Scanner;
public class JavaStdinAndStdout{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        scan.close();
    }
}
/*
Requirement:
Read three integers from standard input (stdin)
and print each integer to standard output (stdout),
with each integer on a new line.

Concept Learned:
Scanner is used to read input from System.in.
*/