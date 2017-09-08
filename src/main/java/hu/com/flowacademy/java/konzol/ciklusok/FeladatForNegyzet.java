package hu.com.flowacademy.java.konzol.ciklusok;

public class FeladatForNegyzet {

    public static void printNegyzetek(int szamok){
        for (int i =0; i<szamok; i++){
            System.out.print(szamNegyzete(i) +",");
        }
    }

    public static Double szamNegyzete(int szsam){
        return Math.pow(szsam,2);
    }


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.print(i*i + ",");
        }
        printNegyzetek(10);
    }
}
