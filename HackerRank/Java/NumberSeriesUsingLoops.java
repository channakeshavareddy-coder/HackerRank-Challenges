/*
 - You are given q queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and n values as a single line of n space-separated integers.
 -
 -      Input Format
 - The first line contains an integer, q, denoting the number of queries.
 - Each line i of the q subsequent lines contains three space-separated integers describing the respective ai, bi, and ni values for that query.
 -
 -      Output Format
 -
 - For each query, print the corresponding series on a new line.
 - Each series must be printed in order as a single line of n space-separated integers.
 */
import java.util.Scanner;
class Solution{
    public static void main(String []argh){
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for(int i = 0; i < q ; i++){

            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (int) Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}