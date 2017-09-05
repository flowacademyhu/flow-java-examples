package hu.com.flowacademy.java.konzol.paracssoriParameterek;


public class SzamOsszehasonlit {

    public static void main(String[] args) {
        int szam1 = Integer.parseInt(args[0]);
        int szam2 = Integer.parseInt(args[1]);

        int kisebb;
        if (szam1 < szam2) {
            kisebb = szam1;
        } else {
            kisebb = szam2;
        }
        //if (szam1 <= szam2) ? szam1 : szam2;
        //Math.min(szam1,szam2);
        double gyok = Math.sqrt(kisebb);
        System.out.println("A kisebbik szám négyzetgyöke: " + gyok);
    }
}
