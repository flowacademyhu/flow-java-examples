package hu.com.flowacademy.java.konzol.osztas;



public class Oszthato23 {

    public static boolean oszthatoKettovel(int szam){
        Boolean eredmeny = false;
        if (szam % 2 ==0){
            eredmeny = true;
        } else {
            eredmeny = false;
        }
        //return szam % 2 ==0;
        return eredmeny;
    }

    public static boolean oszthatoHarommal(int szam){
        return szam % 3 ==0;

    }

    public static void main(String[] args) {
        int szam = Integer.parseInt(args[0]);
        System.out.println("A " + szam + " osztható kettövel: " + oszthatoKettovel(szam));
        System.out.println("A " + szam + " osztható hárommal: " + oszthatoHarommal(szam));
    }
}
