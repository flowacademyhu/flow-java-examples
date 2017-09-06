package hu.com.flowacademy.java.konzol.osszeHasonlit;

import java.util.Scanner;

import static hu.com.flowacademy.java.konzol.osszeHasonlit.SzamOsszehasonlitArgs.szamOsszeHasonlit;

/**
 * Created by istvan on 9/6/17.
 */
public class SzamOsszehasonlitConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem az első számot:");
        int a = scanner.nextInt();
        System.out.println("Kérem a második számot:");
        int b = scanner.nextInt();
        szamOsszeHasonlit(a,b);
    }
}
