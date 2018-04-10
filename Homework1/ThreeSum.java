package Homework.Homework1;

import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] arg)
    {
        int input_a,input_b,input_c = 0;
        Scanner input = new Scanner(System.in);
        input_a = input.nextInt();
        input_b = input.nextInt();
        input_c = input.nextInt();
        double sum = 0;
        double average = 0;
        sum = input_a + input_b + input_c;
        average = sum/3;
        System.out.println("sum="+sum);
        System.out.print("average="+average);
    }
}