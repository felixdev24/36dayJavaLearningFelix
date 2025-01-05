package day1;

import java.util.Scanner;

public class MathOperator {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextDouble();
        System.out.print("Enter the second number: ");
        b = sc.nextDouble();
//        Lấy giá trị tuyệt đối
        System.out.println("|a|="+ Math.abs(a));
//        Lấy giá trị nhỏ nhất
        System.out.println("Min (a , b ): "+ (int)Math.min(a,b));
    }
}
