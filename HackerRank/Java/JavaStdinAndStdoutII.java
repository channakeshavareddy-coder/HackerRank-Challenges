import java.util.Scanner;
public class JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        double num2 = scan.nextDouble();
        scan.nextLine();
        String line = scan.nextLine();

        System.out.println("String: " + line);
        System.out.println("Double: " + num2);
        System.out.println("Int: " + num1);
        scan.close();
    }
}
/*
Requirement:
Read an integer, a double, and a String from standard input,
then print them in the order String, Double, Int,
with their respective labels.

Input Format:
There are three lines of input:
1. The first line contains an integer.
2. The second line contains a double.
3. The third line contains a String.

Output Format:
Print three lines:
1. String: followed by the input String.
2. Double: followed by the input double.
3. Int: followed by the input integer.
*/