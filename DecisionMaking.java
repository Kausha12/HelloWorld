/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;

/**
 *
 * @author Kausha
 */
public class DecisionMaking {
    public static void main(String[] args){
     int input;
    System.out.println("Enter your age");
    Scanner s = new Scanner(System.in);
    input = s.nextInt();
    if(input>18)
            System.out.println("You are eligible to vote");
    else
            System.out.println("You are not eligible to vote");
    }
}
