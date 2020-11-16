/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_6_math_and_logic_puzzles;

/**
 *
 * @author Farzana
 */
public class CheckingThePrimality {
    //  simply native approach from 2 to n-1 
   static boolean primeNative(int n){
       if(n<2) return false;
       for(int i=2; i<n;i++){
           if(n% i==0) 
               return false;
       }
       return true;
    }
   // improvement is to iterate only up through the square root of n;
 static  boolean primeSlightlyBetter(int  n){
       if(n<2) return false;
       int sqrt=(int) Math.sqrt(n);
       for(int i=2;i<=sqrt;i++){
            if(n%i==0) 
                return  false;
       }
       return true;
   
   }
    public static void main(String args[]){
        int n=11;
        System.out.println(CheckingThePrimality.primeNative(n));
         System.out.println(CheckingThePrimality.primeSlightlyBetter(n));
    }
}
