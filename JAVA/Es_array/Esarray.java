import java.util.Scanner;
import java.io.*;

class Array
{
    private int v[]=new int[10];
    private double d[];

    public Array() throws NumberFormatException, IOException{
        int i=0;
        InputStreamReader In = new InputStreamReader(System.in);
        BufferedReader Tastiera = new BufferedReader(In);
        for (i=0; i<10; i++){
            System.out.print("Valore: v["+i+"]= ");
            v[i]=Integer.parseInt(Tastiera.readLine());
        }   
    }

    public Array(int caselle) throws NumberFormatException, IOException{
        int i=0;
        InputStreamReader In = new InputStreamReader(System.in);
        BufferedReader Tastiera = new BufferedReader(In);
        for (i=0; i<caselle; i++){
            System.out.print("Valore: v["+i+"]= ");
            d[i]=double(Tastiera.readLine());
        } 

    }
        

    public void somma(){
        
        int i=0;
        for(i=0; i<10;i++){
            System.out.println("v["+i+"]="+v[i]);
        }

        int S=0;
        for(i=0; i<10;i++){
            S=S+v[i];
        }

        System.out.println("somma="+S);
    }

    public void somma2()throws NumberFormatException, IOException{
        
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
        for (i=0; i<x; i++){
            System.out.print("Valore: ");
            v[i]=Integer.parseInt(Tastiera.readLine());
        }

        for(i=0; i<x;i++){
            System.out.println("v["+i+"]="+v[i]);
        }

        int S=0;
        for(i=0; i<x;i++){
            S=S+v[i];
        }
        
        System.out.println("somma="+S);
    }


    }

    public class Esarray{
        public static void main(String[] args)throws NumberFormatException, IOException{
            
            Scanner scanner = new Scanner(System.in);

            /*System.out.print("Creazione oggetto\n");
            Array array1 = new Array();
            
            System.out.print("*******METODI*******\n");
            System.out.print("SOMMA\n");
            array1.somma();
            
            System.out.print("\nSOMMA 2\n");
            array1.somma2();*/

            
            System.out.print("inserisci il numero: ");
            int k = scanner.nextInt();

            Array array2 = new Array(k);

        }
}