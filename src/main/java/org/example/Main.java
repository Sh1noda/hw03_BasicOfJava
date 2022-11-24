package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //целые числа
        byte a = 112;
        System.out.println(++a);

        short c = -32767;
        short d = -3134;
        short f = (short) (c -d);
        System.out.println(f);

        long r = 2L;
        long t = 14L;
        System.out.println(t / r);

        int z = 15;
        int p = 4;
        System.out.println(z % p);

        //числа с плавающей точкой
        float q = 0.3f;
        float w = 1.2f;
        System.out.println(q * w);

        //логический
        boolean total = 2 > 5;
        System.out.println(total);

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Во сколько ты проснулся?");
        int time = Scanner.nextInt();
        if(time >= 8) {
            System.out.println("Пора просыпаться!");
        } else {
            System.out.println("Можно еще поспать");
        }

        //символьный
        char g = 'k';
        char b = 'o';
        char n = 'T';
        char l = 'u';
        char m = 'k';
        System.out.println(g + "" +b + "" + n + "" + l + "" + m);

        //вычисления int и double
        int firstNumber = 15;
        double secondNumber = 5;
        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);
    }

}