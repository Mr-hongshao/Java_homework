package Homework.Homework2;

import java.util.Scanner;

public class Statistic_letter {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] str_char_ary = str.toCharArray();
        int[] str_statictic = new int[27];
        int count_i = 0;
        for(count_i = 0;count_i<27;count_i++)
        {
            str_statictic[count_i] = 0;
        }
        str_statictic = func_statistic(str_char_ary,str_statictic);
        printer(str_statictic);
    }
    public static int[] func_statistic(char[]  char_ary_input,int[] int_ary_input)
    {
        int count_i = 0;
        for(count_i = 0;count_i<char_ary_input.length;count_i++)
        {
            int_ary_input[func_char_judge(char_ary_input[count_i])]++;
        }
        return int_ary_input;
    }
    public static int func_char_judge(char judge)
    {
        int count_i = 0;
        int return_num = 26;
        for(count_i = 65;count_i < 97;count_i++)
        {
            if ((int) judge == count_i || (int) judge == (count_i + 32)) {
               return_num = count_i - 65;
            }
        }
        return return_num;
    }
    public static void printer(int[] input)
    {
        int count_i = 0;
        for(count_i = 0;count_i<26;count_i++)
        {
            if(input[count_i] != 0)
            {
                System.out.println("("+(char)(count_i+65)+")Num="+input[count_i]);
            }
        }
    }
}
