package com.company;

/**
 * Class Main создан в обучающих целях
 * @author BadikovDA
 * @version 1.0.
 */

public class Main{
    /**
     * Method 'fact' - создан для рассчёта факториала от числа
     * Огранияения: рассчитан на диапозон
     * от -2 147 483 648 до 2 147 483 647
     * @param n -число, от которого берется факториал
     * @return Возвращает значение факториала
     */
    static int fact(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    /**
     * Method 'abs' - создан для вывода модуля числа
     * Ограничения: ограничен диапазоном значений int
     * @param n - число от которого берется модуль
     * @return возвращает модуль от числа
     */
    static int abs(int n) {
        if (n<0) {
            return -n;
        }
        else {
            return n;
        }
    }

    /**
     * Method 'pow' - создан для возведения числа в степень этого же числа
     * @param n - число и степень, в которую будет возводиться число
     * @return возвращает число ВОЗВЕДЕННОЕ в степень от этого числа
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
