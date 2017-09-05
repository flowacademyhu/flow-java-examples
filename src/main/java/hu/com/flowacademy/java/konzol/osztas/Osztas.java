package hu.com.flowacademy.java.konzol.osztas;

public class Osztas {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.println("a = 5, b = 2");
        System.out.println("Normál osztás: " + a/b);
        System.out.println("Maradékos osztás: " + a%b);
        System.out.println("Osztás típuskényszerítéssel: " + ((double)a  / b));

    }

}
