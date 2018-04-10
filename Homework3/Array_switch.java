package Homework.Homework3;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class Array_switch
{
    public static void main(String[] args)
    {
        System.out.println("Please input 10 numbers:");
        Scanner in_Scanner = new Scanner(System.in);
        int[] int_ary = new int[10];
        for (int initual : int_ary)
        {
            initual = 0;
        }
        String input_str = in_Scanner.nextLine();
        String[] temp = input_str.split("\\s");
        for(int count_i = 0; count_i<10;count_i++)
        {

                int_ary[count_i] = Integer.parseInt(temp[count_i]);

        }
        System.out.println("Your numbers are:");
        for (int outer : int_ary)
        {
            System.out.print(outer+" ");
        }
        System.out.println();
        System.out.println("Please input m:");
        int switch_num = in_Scanner.nextInt();
        int[] int_switch = switcher(int_ary,switch_num);
        outer(int_switch);
    }
    public static int[] switcher(int[] input,int para)
    {
        int[] switcher_ary = new int[10];
        for (int initual : switcher_ary)
        {
            initual = 0;
        }
        for(int count_i = 0;count_i<para;count_i++)
        {
            switcher_ary[para-count_i-1] = input[9-count_i];
        }
        for(int count_i = para;count_i<=9;count_i++)
        {
            switcher_ary[count_i] = input[count_i-para];
        }
        return switcher_ary;
    }
    public static void outer(int[] input)
    {
        System.out.println("The new numbers are:");
        for(int outer : input)
        {
            System.out.print(outer+" ");
        }
    }
}
