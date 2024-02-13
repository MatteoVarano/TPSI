import java.util.Scanner;

public class Equazione{
    public static void main(String[] args){
            if(args.length != 3){
            System.out.print("Nessun numero e' stato inserito");
            return;
        }

        double a=0;
        double b=0;
        double c=0;
        double[] numeri = new double[args.length];

        for(int i = 0; i < args.length; i++){

            numeri[i]= Double.parseDouble(args[i]);

            if(i == 0){
                a = numeri[i];
            }
            if(i == 1){
                b = numeri[i];
            }
            if(i == 2){
                c = numeri[i];
            }
        }
        
        
        
    }
}