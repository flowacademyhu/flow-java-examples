package hu.com.flowacademy.java.konzol.masodfoku;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MasodfokuEgyenlet {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException
    {
        // TODO code application logic here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("a = "); float a=Float.parseFloat(br.readLine());
        System.out.print("b = "); float b=Float.parseFloat(br.readLine());
        System.out.print("c = "); float c=Float.parseFloat(br.readLine());

        MasodfokuEgyenletMegold egyenletMegold =new MasodfokuEgyenletMegold(a,b,c);
        if(egyenletMegold.vanmegoldas())
        {
            System.out.println("x1 = "+egyenletMegold.getX1());
            System.out.println("x2 = "+egyenletMegold.getX2());
        }
        else
        {
            System.out.println("Nincs megoldas");
        }

    }
}
