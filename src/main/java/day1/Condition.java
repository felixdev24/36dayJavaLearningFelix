package day1;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int a = sc.nextInt();

        String result = (a%2==0) ? "even" : "odd";
        System.out.println(result);
    }
}
