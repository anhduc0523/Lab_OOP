package lab01;

import java.util.Scanner;
import javax.swing.*;

public class Doublenumber {
    public static void main(String[] args){
    	
        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st double: ");
        double firstDouble = in.nextDouble();
        System.out.print("Input 2nd double: ");
        double secondDouble = in.nextDouble();

        System.out.printf("Sum of two doubles: %.2f\n", firstDouble + secondDouble);
        System.out.printf("Difference of two doubles: %.2f\n", firstDouble - secondDouble);
        System.out.printf("Product of two doubles: %.2f\n", firstDouble * secondDouble);
        System.out.printf("Quotient of two doubles: %.2f\n", (double) (firstDouble/ secondDouble));
        
    }
}
