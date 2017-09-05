package hu.com.flowacademy.java.konzol.stringek;



public class Anagramma {

    public static String anagramma(String content){

        StringBuffer contentBuffer = new StringBuffer(content);
        return contentBuffer.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(anagramma("Indul a görög aludni"));
    }
}
