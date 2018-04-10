package Homework.Homework3;

import java.util.Scanner;

public class Statistic_str
{
    public static void main(String[] arg)
    {
        System.out.println("Please input a sentence:");
        String input_str = new String();
        Scanner input = new Scanner(System.in);
        input_str = input.nextLine();
        char[] char_ary = input_str.toCharArray();
        int[] statistic_num = new int[4];
        for (int initiual : statistic_num)
        {
            initiual = 0;
        }
        for (char input_char:char_ary)
        {
            statistic_num = statistictor(judger(input_char),statistic_num);
        }
        outer(statistic_num);
    }
    public static int[] statistictor(int input_judge,int[] statistic)
    {
        if(input_judge == 0)
        {
            statistic[0]++;
        }
        if(input_judge == 1)
        {
            statistic[1]++;
        }
        if(input_judge == 2)
        {
            statistic[2]++;
        }
        if(input_judge == 3)
        {
            statistic[3]++;
        }
        return statistic;
    }
    public static int judger(char input)
    {
        int judge_input = (int) input;
        if((judge_input>=48) && (judge_input<=57))
        {
            return 0;
        }
        if((judge_input>=65) && (judge_input<=90)||(judge_input>=97) && (judge_input<=122))
        {
            return 1;
        }
        if(judge_input==32)
        {
            return 2;
        }
        return 3;
    }
    public static void outer(int[] input_sta)
    {
        System.out.println("The number of numbers is: "+input_sta[0]);
        System.out.println("The number of English letters is: "+input_sta[1]);
        System.out.println("The number of blank space is: "+input_sta[2]);
        System.out.println("The number of other characters is: "+input_sta[3]);
    }
}
