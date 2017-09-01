package hu.com.flowacademy.java.konzol.minmax;

import java.util.Random;

/**
 * Created by istvan on 9/1/17.
 */
public class MinMax {

    private int tomb[];
    private int maximum;
    private int minimum;

    public MinMax()
    {
        tomb= new int[100];
        Random rnd=new Random();
        for( int i=0; i<100; i++)
            tomb[i]=rnd.nextInt();

        maximum=minimum=tomb[0];
        for(int j=1; j<100; j++)
        {
            if( tomb[j]<minimum)
                minimum=tomb[j];
            if(tomb[j]>maximum)
                maximum=tomb[j];
        }
    }
    public int getMax()
    {
        return maximum;
    }
    public int getMin()
    {
        return minimum;
    }
}
