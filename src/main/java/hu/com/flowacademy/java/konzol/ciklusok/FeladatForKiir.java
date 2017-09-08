package hu.com.flowacademy.java.konzol.ciklusok;


public class FeladatForKiir {

    public static void szovegKiir(String szoveg, int ismetlesekSzama){
        for (int i = 0; i< ismetlesekSzama; i++){
            System.out.println(szoveg);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i< 20; i++){
            System.out.println("Jó napot kívánok!");
        }
        szovegKiir("Jó napot kívánok!",20);
    }
}
