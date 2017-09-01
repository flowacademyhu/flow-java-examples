package hu.com.flowacademy.java.konzol.fileBeOlvas;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileBeOlvas {

    private static String readFile( String file ) throws IOException
    {
        BufferedReader reader = new BufferedReader( new FileReader(file));
        String         line = null;
        StringBuilder  stringBuilder = new StringBuilder();
        String         ls = System.getProperty("line.separator");

        while( ( line = reader.readLine() ) != null )
        {
            stringBuilder.append( line );
            stringBuilder.append( ls );
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args)throws IOException
    {
        // TODO code application logic here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("File nev:");String fname=br.readLine();
        System.out.println(readFile(fname));
    }
}
