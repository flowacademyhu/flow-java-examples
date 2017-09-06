package hu.com.flowacademy.java.konzol.erdemjegy;


public class Erdemjegy {

    public static void main(String[] args) {
        if (args.length >0) {
            int jegy = Integer.parseInt(args[0]);

            switch (jegy) {
                case 1:
                    System.out.println("ELÉGTELEN");
                    break;
                case 2:
                    System.out.printf("Elégséges");
                    break;
                case 3:
                    System.out.println("Közepes");
                    break;
                case 4:
                    System.out.println("Jó");
                    break;
                case 5:
                    System.out.println("Jeles");
                    break;
                default:
                    System.out.println("nincs ilyen oszttályzat");
            }
        } else {
            System.out.println("Kérlek add meg az érdemjegyed!");
        }
    }
}
