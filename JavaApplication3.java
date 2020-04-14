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
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int mins = sc.nextInt();
        int yr =0, days=0;
        if(mins>=525949)
        {
             yr = mins/525949;
            mins = mins - (yr*525949);
             days = mins/1440;
        }
        else
        {
             days = mins/1440;
        }
        System.out.println(yr + " Years And " + days +"Days");
        
        
    }
    
}
