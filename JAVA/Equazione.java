import java.util.Scanner;

public class Equazione{
    public static void main(String[] args){
            if(args.length != 3){
            System.out.print("Nessun numero e' stato inserito");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double delta = b * b - 4 * a * c;
        if(delta > 0){
            double x1 = (- b + Math.sqrt(delta)) / (2 * a);
            double x2 = (- b - Math.sqrt(delta)) / (2 * a);
            System.out.println("il valore di x1 e':" + x1);
            System.out.println("il valore di x2 e':" + x2);
        } else if (delta == 0) {
            double x = - b / (2 * a);
            System.out.println("il valore di x e':" + x);
        }else{
            System.out.println("equazione impossibile");
        }
    }
}