package hu.com.flowacademy.java.konzol.veletlen;

import java.util.Random;

public class VeletlenKulonbseg {

    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(101);
        int b = random.nextInt(101);
        System.out.println("Az 1. szám a " + a);
        System.out.println("A 2. szám a " + b);

        if (a > b ) {
            System.out.println("A két szám különbsége: " + (a - b));
        } else {
            System.out.println("A két szám különbsége: " + (b - a));
        }
    }
}
