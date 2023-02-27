import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();
        System.out.println("Sample output for value " + number + ":");
        int x = 2;
        while (x <= number){
            if (number % x == 0){
                System.out.println(number + " is not a prime number");
            }
            else{
                System.out.println(number + " is a prime number.");
            }
            x++;
        }
    }
}
