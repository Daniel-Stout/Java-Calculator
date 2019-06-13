/*  
 *  Program Name : Simple Java Calculator
 *  Author : Daniel Stout II
 *  Date Created : December 17, 2018
 *  Last Updated : June 13, 2019
 *  Description : This is a very simple Java Calculator  
 *  that runs in the Command Prompt / Terminal
*/      

import java.util.Scanner;

import static java.lang.System.*;

public class Calc {
    private static Scanner o;
	private static Scanner input;
	private static Scanner input2;
	private static Scanner c;

	public static void main(String [] args) {
        runCalc(true);
    }

    private static void add(double n1, double n2) {
        double res = n1 + n2;
        out.println("\nResult : " + res);
        restart();
    }
    
    private static void sub(double n1, double n2) {
        double res = n1 - n2;
        out.println("Result : " + res);
        restart();
    }
    
    private static void mult(double n1, double n2) {
        double res = n1 * n2;
        out.println("\nResult : " + res);
        restart();
    } 
    
    private static void div(double n1, double n2) {
        if (n2 == 0) {
            out.println("Error : Divide By Zero");
        } else {
            double res = n1 / n2;
            out.println("\nResult : " + res);
        }
        restart();
    }
    
    private static void mod(double n1, double n2) {
        double res = n1 % n2;
        out.println("\nResult : " + res);
        restart();
    }

    private static void end() {
        return;
    }

    private static void restart() {
        out.println("\nWould you like to do another?");
        out.println("1. Yes");
        out.println("2. No");
        out.print("\nChoice : ");
        c = new Scanner(in);
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
        
        out.println("Please enter the operator's corresponding number.");
        out.println("\n1. Addition");
        out.println("2. Subtraction");
        out.println("3. Multiplication");
        out.println("4. Division");
        out.println("5. Modulus");
        
        System.out.print("\nOperation : ");
        o = new Scanner(in);
        int z = o.nextInt();
        int opp = z;
        
        System.out.print("\nFirst Number : ");
        input = new Scanner(in);
        double x = input.nextDouble();
        double n1 = x;

        System.out.print("Second Number : ");
        input2 = new Scanner(in);
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
            out.println("That is not a correct opperation.");
        } if (opp <= 0) {
            out.println("That is not a correct opperation.");
        }
    }
}