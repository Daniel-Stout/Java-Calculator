/*  
 *  Program Name : Simple Java Calculator
 *  Author : Daniel Stout II
 *  Date Created : December 17, 2018
 *  Description : This is a very simple Java Calculator  
 *  that runs in the Command Prompt / Terminal
*/      

import java.util.Scanner;

public class Calc {
    public static void main(String [] args) {
        runCalc(true);
    }

    private static void add(double n1, double n2) {
        double res = n1 + n2;
        System.out.println("\nResult : " + res);
        restart();
    }
    
    private static void sub(double n1, double n2) {
        double res = n1 - n2;
        System.out.println("Result : " + res);
        restart();
    }
    
    private static void mult(double n1, double n2) {
        double res = n1 * n2;
        System.out.println("\nResult : " + res);
        restart();
    } 
    
    private static void div(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Error : Divide By Zero");
        } else {
            double res = n1 / n2;
            System.out.println("\nResult : " + res);
        }
        restart();
    }
    
    private static void mod(double n1, double n2) {
        double res = n1 % n2;
        System.out.println("\nResult : " + res);
        restart();
    }

    private static void end() {
        return;
    }

    private static void restart() {
        System.out.println("\nWould you like to do another?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print("\nChoice : ");
        Scanner c = new Scanner(System.in);
        int yesNo = c.nextInt();

        if (yesNo == 2){
            end();
        } if (yesNo >= 3) {
            System.out.println("That is not a correct number.");
        } if (yesNo <= 0) {
            System.out.println("That is not a correct number.");
        } if (yesNo == 1){
            runCalc(true);
        }
    }
    
    public static void runCalc(boolean run) {
        if (run == false){
            end();
        }
        
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        
        System.out.print("\nOperation : ");
        Scanner o = new Scanner(System.in);
        int z = o.nextInt();
        int opp = z;
        
        System.out.print("\nFirst Number : ");
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double n1 = x;

        System.out.print("Second Number : ");
        Scanner input2 = new Scanner(System.in);
        double y = input2.nextDouble();
        double n2 = y;

        if (opp == 1){
            add(n1, n2);
        } if (opp == 2) {
            sub(n1, n2);
        } if (opp == 3) {
            mult(n1, n2);
        } if (opp == 4) {
            div(n1, n2);
        } if (opp == 5) {
            mod(n1, n2);
        } if (opp >= 6) {
            System.out.println("That is not a correct opperation.");
        } if (opp <= 0) {
            System.out.println("That is not a correct opperation.");
        }
    }
}