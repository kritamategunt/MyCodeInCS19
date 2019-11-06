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
   
   
}
