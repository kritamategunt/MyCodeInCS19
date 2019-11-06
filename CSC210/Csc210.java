/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc210;
import java.util.Scanner;
import java.util.Arrays;
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
        /*System.out.print("Pls input your number: ");int n = sc.nextInt(); 
        System.out.print("Following are the prime numbers "); 
        System.out.println("smaller than or equal to " + n ); 
        algo g = new algo(); 
        g.sieve(n); 
        System.out.println("");
        System.out.println(" has prime "+g.getCount());
        System.out.println("--------------------------------");
        System.out.println("");
        System.out.println("-mode-");
        int i = 7;
        int a[] = {0,6,7,2,7,2,2};
        algo.mode(a,i);
        System.out.println("--------------------------------");
        
   
        String pattern = sc.next();
        int length = pattern.length();
        int sizeForLoop = length-2;
        String text = sc.next();
        int count = 0;
        for (int h = 0; h <= text.length()-length; h++) {
            if(pattern.equalsIgnoreCase(text.substring(h,h+length))){
                count++;
            }
        }
        if(count>=1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }*/
        
        
         int[][] a = {{2,3},{3,2}};
        int[][] b = {{2,5},{5,5}};
        int[][] result = algo.matrixMultiplication(a, b);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }
        
        //int a[] = new int[n];
        //n = sc.nextInt();
        //for (int i = 0; i <= n; i++) {
          //  a[i] = sc.nextInt();
        //}
        /*Arrays.sort(a);
        int maxC = 0;
        int mode = a[0];
        int c =0;
        int x = 0;
        for (int i = 0; i < n-2; i++) {
            x = a[i];
            c++;
        }
        */
        
    }

    } 

