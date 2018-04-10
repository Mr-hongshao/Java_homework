package Homework.Homework1;

import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.Scanner;

public class Char_Change {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String str_out = "";
        char[] str_char = str.toCharArray();
        for (char output : str_char) {
            if ((int) output >= 97) {
                output -= 32;
            }
            str_out += output;
        }
        System.out.println("result:"+str_out);
    }
}
