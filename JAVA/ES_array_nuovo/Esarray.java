import java.util.Scanner;
import java.io.*;

class Array
{
    public void es1() throws NumberFormatException, IOException
    {         
        int i=0;
        int v[]=new int[10];
        InputStreamReader In = new InputStreamReader(System.in);
        BufferedReader Tastiera = new BufferedReader(In);
        for (i=0; i<10; i++)
        {
            System.out.print("Valore: v["+i+"]= ");
            v[i]=Integer.parseInt(Tastiera.readLine());
        }
        for(i=0; i<10;i++)
        {
            System.out.println("v["+i+"]="+v[i]);
        }
        int S=0;
        for(i=0; i<10;i++)
        {
            S=S+v[i];
        }
        System.out.println("somma="+S);
    }

    public void es2() throws NumberFormatException, IOException
    {
        int x;
        InputStreamReader In = new InputStreamReader(System.in);
        BufferedReader Tastiera = new BufferedReader(In);
        do{
            System.out.print("Immettere un numero: ");
            x=Integer.parseInt(Tastiera.readLine());
        }while (x<=0);
        System.out.println("numero inserito: " + x);
        int i=0;
        int v[]=new int[x];
        for (i=0; i<x; i++)
        {
            System.out.print("Valore: ");
            v[i]=Integer.parseInt(Tastiera.readLine());
        }

        for(i=0; i<x;i++)
        {
            System.out.println("v["+i+"]="+v[i]);
        }
        int S=0;
        for(i=0; i<x;i++)
        {
            S=S+v[i];
        }
        System.out.println("somma="+S);
    }

    public void es3() throws NumberFormatException, IOException
    {
        int x;
        InputStreamReader In = new InputStreamReader(System.in);
        BufferedReader Tastiera = new BufferedReader(In);
        do{
            System.out.print("Immettere un numero: ");
            x=Integer.parseInt(Tastiera.readLine());
        }while (x<=0);
        System.out.println("numero inserito: " + x);
        int i=0;
        double v[]=new double[x];
        for (i=0; i<x; i++)
        {
            System.out.print("Valore: ");
            v[i]=Integer.parseInt(Tastiera.readLine());
        }

        double somma=0;
        for(i=0;i<x;i++)
        {
            if(v[i]<0)
            {
                somma+=v[i];
            }
        }

        System.out.print("Somma: "+ somma+"\n");
        
    }

    public void es4() throws NumberFormatException, IOException
    {
        int i=0;
        int v[]=new int[10];
        InputStreamReader In = new InputStreamReader(System.in);
        BufferedReader Tastiera = new BufferedReader(In);
        for (i=0; i<10; i++)
        {
            System.out.print("Valore: v["+i+"]= ");
            v[i]=Integer.parseInt(Tastiera.readLine());
        }

        double massimo = Double.NEGATIVE_INFINITY;
        for(i=0;i<10; i++)
        {
            if(v[i]>massimo)
            {
                massimo=v[i];
            }
        }

        System.out.print("Il numero piu' grande e': " + massimo + "\n");
    }
}

public class Esarray
{
    public static void main(String[] args)throws NumberFormatException, IOException
    {
        Array array1 = new Array();
        
        array1.es4();

        //array1.es3();
    }
}