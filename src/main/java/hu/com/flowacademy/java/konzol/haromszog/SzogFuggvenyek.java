package hu.com.flowacademy.java.konzol.haromszog;


public class SzogFuggvenyek {

    public static void szogFuggvenyek(int alpha){
        double alphaRadius = Math.toRadians(alpha);
        System.out.println("Sin(" + alpha + ") = " + Math.sin(alphaRadius));
        System.out.println("Cos(" + alpha + ") = " + Math.cos(alphaRadius));
        System.out.println("Tan(" + alpha + ") = " + Math.tan(alphaRadius));
    }

    public static void main(String[] args) {

               szogFuggvenyek(30);
    }
}
