package hu.com.flowacademy.java.konzol.szoJatek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class SzoJatek {
    private String szotar[];
    public SzoJatek()
    {
        szotar= new String[30];
        szotar[0]="alma";
        szotar[1]="korte";
        szotar[2]="barack";
        szotar[3]="mama";
        szotar[4]="asztal";
        szotar[5]="szekreny";
        szotar[6]="android";
        szotar[7]="windows";
        szotar[8]="linux";
        szotar[9]="szilva";
        szotar[10]="kelkaposzta";
        szotar[11]="ajto";
        szotar[12]="ablak";
        szotar[13]="napilap";
        szotar[14]="tenisz";
        szotar[15]="teve";
        szotar[16]="oroszlan";
        szotar[17]="pap";
        szotar[18]="iskola";
        szotar[19]="agilis";
        szotar[20]="java";
        szotar[21]="informatika";
        szotar[22]="telefon";
        szotar[23]="fazek";
        szotar[24]="labas";
        szotar[25]="villany";
        szotar[26]="miniszter";
        szotar[27]="kakao";
        szotar[28]="cukor";
        szotar[29]="lotto";

    }
    public void Run()throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        boolean flag=true;
        while(flag)
        {
            Random rnd= new Random();
            int index= rnd.nextInt(30);
            int len=szotar[index].length();
            System.out.println("A kitalálandó szó hossza: "+Integer.toString(len));
            boolean jatek=true;
            while(jatek)
            {
                System.out.print("Tipp :");String tipp=br.readLine();
                if(tipp.length()!=len)
                {
                    System.out.println("Nem passzol a szó hossza!");
                    continue;
                }
                String valasz="";
                int db=0;
                for(int i=0; i<len; i++)
                {
                    char B=szotar[index].charAt(i);
                    if( B==tipp.charAt(i))
                    {
                        valasz+=B;
                    }
                    else
                    {
                        valasz+=".";
                        db++;
                    }
                }
                System.out.println(valasz);
                if(db==0)
                {
                    System.out.println("Talált");
                    jatek=false;
                }
            }
            System.out.print("Kilépés (igen/nem)");String s=br.readLine();
            if(s.compareToIgnoreCase("igen")==0)
                flag=false;

        }
    }

}
