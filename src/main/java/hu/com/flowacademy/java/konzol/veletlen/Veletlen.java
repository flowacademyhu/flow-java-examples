package hu.com.flowacademy.java.konzol.veletlen;


import java.util.Random;

public class Veletlen {

    public static void randomSzamok() {
        Random random = new Random();
        int szam1 = random.nextInt(10) + 10;
        int szam2 = random.nextInt(10) + 10;

        int osszeg = szam1 + szam2;
        int szorzat = szam1 * szam2;

        System.out.println("A két szám: " + szam1 + " és " + szam2);
        System.out.println("Az összegük: " + osszeg);
        System.out.println("A szorzatuk: " + szorzat);
    }

    public static void main(String[] args) {
        randomSzamok();
    }
}
