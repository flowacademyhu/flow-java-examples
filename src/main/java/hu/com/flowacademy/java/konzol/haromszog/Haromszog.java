package hu.com.flowacademy.java.konzol.haromszog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Haromszog {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        // TODO code application logic here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("a = "); float a=Float.parseFloat(br.readLine());
        System.out.print("b = "); float b=Float.parseFloat(br.readLine());
        System.out.print("c = "); float c=Float.parseFloat(br.readLine());

        if( (a+b)>c && (b+c)>a && (a+c)>b)
            System.out.println("Háromszög számok");
        else
            System.out.println("nem háromszög számok");

    }
}
