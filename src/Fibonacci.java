/**
 * Class: Fibonacci
 * Author: William Chokbengboune
 * Date: March 13, 2023
 * Description: This calculates the fibonacci numbers
 */
public class Fibonacci {
    public static void main(String[] args){
        int starter = 0;
        int fibonacci = 1;
        for (int i = 0; i < 30; i++){
            starter += fibonacci;
            fibonacci = starter;
            System.out.println(starter);
            i++;
        }
    }
}
