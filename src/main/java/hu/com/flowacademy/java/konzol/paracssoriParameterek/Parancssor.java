package hu.com.flowacademy.java.konzol.paracssoriParameterek;




class Parancssor {

    public static void main(String[] args) {
        System.out.println("Parancssori paraméterek: ");

        for (String s : args) {
            System.out.println(s);
        }

        System.out.println();
        System.out.println("Parancssori paraméterek fordított sorrendben: ");
        for (int i = args.length - 1; i >= 0; --i) {
            System.out.println(args[i]);
        }

        System.out.println();
        for (int i = 0; i < args.length; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print(args[j] + " ");
            }
            System.out.println();
        }

    }

}