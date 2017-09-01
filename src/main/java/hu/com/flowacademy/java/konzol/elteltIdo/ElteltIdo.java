package hu.com.flowacademy.java.konzol.elteltIdo;


public class ElteltIdo {

    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Hiba! Parancssori paraméterek: óra1 perc2 óra2 perc2");
            System.exit(1);
        }

        // String -> int
        int ora1 = Integer.parseInt(args[0]);
        int perc1 = Integer.parseInt(args[1]);
        int ora2 = Integer.parseInt(args[2]);
        int perc2 = Integer.parseInt(args[3]);

        // input ellenőrzése
        if (!(ora1 >= 0 && ora1 < 24) || !(perc1>=0 && perc1 < 60)
                || !(ora2 >= 0 && ora2 < 24) || !(perc2 >= 0 && perc2 < 60)) {
            System.out.println("Hiba! Érvénytelen input.");
            System.exit(1);
        }

        // az eredmény
        int elteltPerc = (ora2 * 60 + perc2) - (ora1*60 + perc1);
        System.out.println("Az eltelt idő: " + elteltPerc/60 + ":" + elteltPerc%60);
    }

}