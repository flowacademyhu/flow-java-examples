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

    public static void main(String[] args) {
        int szam = Integer.parseInt(args[0]);
        oszthatoKettovel(szam);
    }
}
