/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc210;

import java.util.Scanner;
/**
 *n
 * @author kritamate
 */
public class algo {
int cc;
   void sieve(int n) 
    { 
        boolean []pm = new boolean[n+1];
        for (int i = 0; i <=n ; i++) {
            pm[i] = true;
        }
        for (int p = 2; p*p >= n; p++) {
            if (pm[p]==true) {
                for (int i = p*2; i <=n ; i+=p) {
                    pm[i] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (pm[i] == true) {
                System.out.print(i+" ");
                cc++;
            }
        }
   
        
        
    } 
    int getCount(){
        return cc;
    }
    
    static void mode(int a[],int n){
        int maxValue = 0,maxCount = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int l = 0; l < n ; ++l) {
                if (a[l]==a[i]) {
                    count++;
                }
            }
            if(count>maxCount){
                count = maxCount;
                 maxValue = a[i];
            }
        }
        System.out.println(maxValue);
        
    }
    
     public static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return c;
    }
    
    
   
   
   
}
