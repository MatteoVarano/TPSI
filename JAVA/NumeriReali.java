import java.util.Scanner;

public class NumeriReali {
    public static void main(String[] args){
        if(args.length < 1){
            System.out.print("Nessun numero e' stato inserito");
            return;
        }

        double somma = 0;
        double massimo = Double.NEGATIVE_INFINITY;
        double minimo = Double.POSITIVE_INFINITY;
        double[] numeri = new double[args.length];
        for(int i = 0; i < args.length; i++){
            numeri[i]= Double.parseDouble(args[i]);
            somma += numeri[i];

            for(String arg : args){
                if (numeri[i] > massimo) {
                    massimo = numeri[i];
                }
                if (numeri[i] < minimo) {
                    minimo = numeri[i];
                }
            }
        }

        double media = somma / args.length;

        System.out.println("Somma: " + somma);
        System.out.println("Media: " + media);
        System.out.println("Massimo: " + massimo);
        System.out.println("Minimo: " + minimo);

    }
}