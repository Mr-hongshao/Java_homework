package Homework.Homework1;

import java.util.Scanner;

public class find_Pnum {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int start = 0;
        int end = 0;
        start = input.nextInt();
        end = input.nextInt();
        System.out.println(start+" to "+end+" WanShu:");
        for(int count_start = start;count_start<=end;count_start++)
        {
            int sum_judge =0;
            for(int temp_count = 1;temp_count<count_start;temp_count++)
            {
                if(count_start%temp_count == 0)
                {
                    sum_judge = sum_judge + temp_count;
                }
            }
            if(sum_judge==count_start)
            {
                System.out.print(count_start+",");
            }
        }
    }
}
