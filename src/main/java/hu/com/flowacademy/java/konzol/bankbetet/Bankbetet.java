package hu.com.flowacademy.java.konzol.bankbetet;


import java.util.Scanner;

public class Bankbetet {

    private final static Double KAMAT_LAB = 0.04;

    public static double betetKalkulacio(Integer osszeg, Integer honap){
        return osszeg + (osszeg * (Math.pow(1 + KAMAT_LAB,honap)/12));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mekkora összeget kíván lekötni?");
        int osszeg = scanner.nextInt();
        System.out.println("Hány hónapra kívánja lekötni?");
        int honap = scanner.nextInt();
        System.out.println("Kamatozott összeg: " + betetKalkulacio(osszeg,honap));
    }
}
