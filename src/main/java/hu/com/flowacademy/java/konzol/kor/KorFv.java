package hu.com.flowacademy.java.konzol.kor;


public class KorFv {

    final static double PI = 3.1415926539;

    public static double korTeruletSzamol(int r){
        return Math.pow(r,2) * PI;
    }

    public static double korKeruletSzamol(int r){
        return 2 * r * PI;
    }

    public static void main(String[] args) {
        int r = 15;
        System.out.println("A(z) " + r + " sugarú kör kerülete:\t" + korKeruletSzamol(r));
        System.out.println("A(z) " + r + " sugarú kör területe:\t" + korTeruletSzamol(r));
    }
}
