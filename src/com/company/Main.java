package com.company;

/**
 * Class Main создан в обучающих целях
 * Method fact - считает факториал числа
 * Method abs - модуль числа
 * Method pow - возведение в степень
 * @author BadikovDA
 * @version 1.0.
 */

public class Main{
    static int fact(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    static int abs(int n) {
        if (n<0) {
            return -n;
        }
        else {
            return n;
        }
    }

    public static int pow(int n){
        return n*n;
    }

    public static void main(String[] args){
        System.out.println(fact(10));
        System.out.println(abs(10));
        System.out.println(pow(2));
    }
}
