package Prime;

import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int n=s.nextInt();
        int c=2;
        while (c<n) {
            if (n % c == 0) {
                System.out.println(n + " is not a prime number");
                return;
            }
            c++;
        }
        System.out.println(n+" is a Prime Number");
        }
    }
