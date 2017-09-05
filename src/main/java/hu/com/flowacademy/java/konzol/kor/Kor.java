package hu.com.flowacademy.java.konzol.kor;


public class Kor {
    public static void main(String[] args) {
        final double PI = 3.1415926539;
        int r = 5;
        double terulet = r * r * PI; //Math.pow(r,2) * PI
        double kerulet = 2 * r * PI;
        System.out.println("Az 5 egység súgarú kor kerülete: " + kerulet);
        System.out.println("Az 5 egység súgarú kor területe: " + terulet);
    }
}
