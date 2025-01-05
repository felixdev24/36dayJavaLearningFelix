package day1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        double[] a;
        double mang2[];

        a = new double[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter an array element "+(i+1)+": ");
            a[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("The sum of the elements is: "+ (int)sum);

        mang2 = new double[]{2,4,5};
        for (int i = 0; i < mang2.length; i++) {
            System.out.print(mang2[i]);
        }
    }
}
