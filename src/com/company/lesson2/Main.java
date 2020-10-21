package com.company.lesson2;

/**
 * Class Main sozdan v obuchayshih zhelyah
 * @author BadikovDA
 * @version 1.0.
 */

public class Main{
    /**
     * Method 'fact' - calculates factorial
     * Ogranicheniya: rasshitan na diopazon
     * ot -2 147 483 648 do 2 147 483 647
     * @param n -chislo ot kotorogo beretsya factorial
     * @return Vozvrashaet znachenie factorial
     */
    public static int fact(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    /**
     * Method 'abs' - outputings modul
     * Ogranicheniya: rasshitan na diopazon INT
     * @param n - chislo ot kotorogo beretsya modul
     * @return Vozvrashaet modul ot chisla
     */
    public static int abs(int n) {
        if (n<0) {
            return -n;
        }
        else {
            return n;
        }
    }

    /**
     * Method 'pow' - squaring a number
     * @param n - chislo i stepen' v kotory budet vozvedeno chislo
     * @return Vozvrashaet vozvedenoe chislo
     */
    public static int pow(int n){
        return n*n;
    }

    public static void main(String[] args){
        System.out.println(fact(10));
        System.out.println(abs(10));
        System.out.println(pow(2));
    }
}
