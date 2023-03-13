/**
 * Class: MinAndMax
 * Author: William Chokbengboune
 * Date: March 13, 2023
 * Version: 1.0
 * Description: This code takes the user input and returns the highest and lowest integer as the output.
 */

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student grade: ");
        int max = in.nextInt();
        int min = max;
        while (in.hasNextInt()){//This line checks that the user is entering integers
            int holder = in.nextInt();//The holder variable is used to hold the value so min and max is not overwritten.
            if (holder > max){
                max = holder;
            }
            if (holder <= max) {
                min = holder;
            }
        }
        System.out.println("The minimun is " + min);
        System.out.println("The maximum is" + max);
    }
}
