package hu.com.flowacademy.java.konzol.osszeHasonlit;




public class SzamOsszehasonlitArgs {

    public static void szamOsszeHasonlit(int a, int b){

        if (a == b) {
            System.out.println("A két szám megegyezik");
        }
        if (a > b) {
            System.out.println("Az első szám a nagyobb");
        }
        if (a < b) {
            System.out.println("A második szám a nagyobb");
        }

    }


    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        szamOsszeHasonlit(a,b);
        //szamOsszeHasonlit(Integer.parseInt(args[0]),Integer.parseInt(args[1]));

    }
}
