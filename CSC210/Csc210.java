/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc210;
import java.util.Scanner;
/**
 *
 * @author kritamate
 */
public class Csc210 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Pls input your number: ");int n = sc.nextInt(); 
        System.out.print("Following are the prime numbers "); 
        System.out.println("smaller than or equal to " + n ); 
        algo g = new algo(); 
        g.sieve(n); 
        System.out.println("");
        System.out.println(" has prime "+g.getCount());

    } 
}
