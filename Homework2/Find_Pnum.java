package Homework.Homework2;

import java.util.Scanner;

public class Find_Pnum {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int input_num = in.nextInt();
        while(input_num != 0)
        {
            printer(func_judge(input_num),input_num);
            input_num = in.nextInt();
        }
        System.out.println("programe is over.");
    }
    public static boolean func_judge(int para)
    {
        if(para>2)
        {
            for(int count_i = 2;count_i<para;count_i++)
            {
                if(para%count_i == 0)
                {
                    return false;
                }
            }
            return true;
        }
        else
        {
            if(para == 2)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    public static void printer(boolean judge,int num) {
        if (judge == true) {
            System.out.println(num + " is sushu.");
        }
        if (judge == false) {
            System.out.println(num + " is not sushu.");
        }
    }
}
