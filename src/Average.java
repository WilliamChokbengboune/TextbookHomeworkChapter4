/**
 * Class: Average
 * Author: William Chokbengboune
 * Date: March 14, 2023
 * Description: This class takes entered grades and returns the average of them
 */

import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter grades: ");
        int count = 0;
        double sum = 0.0;
        double temperature = 0.0;
        while (in.hasNextDouble()){
            temperature = in.nextDouble();
            sum += temperature;
            count++;
        }
        double average = sum/count;
        System.out.println(temperature);
        System.out.printf("Average student grade is %.2f.", average);

    }
}
