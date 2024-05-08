import java.io.*;
import java.util.Scanner;

public class stringa {
    public static void main (String[] args){
        //a();
        //b();
    }

    public static void a(){
        
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Inserisci una stringa: ");
        String stringa = scanner.nextLine();

        int lunghezza = stringa.length();
        System.out.println("lunghezza: " + lunghezza);

        char carattereCentrale = stringa.charAt(lunghezza / 2);
        System.out.println("carattereCentrale = " + carattereCentrale);

        stringa = stringa.substring(0, 1).toUpperCase() + stringa.substring(1);
        System.out.println("Stringa con prima lettera maiuscola = " + stringa);

        int na=0;
        for (int i = 0; i < stringa.length(); i++) {
            if (stringa.charAt(i) == 'a') {
                na++;
            }
        }
        System.out.println("Numero di occorrenze di 'a' = " + na);

        String sottoStringa = stringa.substring(0, 4);
        System.out.println("Stringa dal primo al quarto carattere = " + sottoStringa);

        
        stringa = stringa.toUpperCase();
        System.out.println(stringa);

        
        stringa = stringa.toLowerCase();
        System.out.println(stringa);

        
        if (isPalindromo(stringa))
            System.out.println("La stringa è palindroma");
        else
            System.out.println("La stringa non è palindroma");

        scanner.close();
    }

    public static boolean isPalindromo(String stringa) {
        for (int i = 0; i < stringa.length() / 2; i++) {
            if (stringa.charAt(i) != stringa.charAt(stringa.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void b(){

        Scanner scanner = new Scanner(System.in);

        // legge stringa
        System.out.print("Inserisci una stringa: ");
        String stringa = scanner.nextLine();

        // legge una seconda stringa
        System.out.print("Inserisci una stringa: ");
        String stringa2 = scanner.nextLine();

        // controlla se le stringhe sono uguali
        if (stringa.equalsIgnoreCase(stringa2))
            System.out.println("le stringhe sono uguali");
        else
            System.out.println("le stringhe non sono uguali");

        // legge un numero intero
        System.out.print("Inserisci un numero intero: ");
        stringa2 = scanner.nextLine();

        int x = Integer.parseInt(stringa2);
        System.out.println("Il numero inserito è: " + x);

        // legge un numero decimale
        System.out.println("Inserisci un numero decimale: ");
        stringa2 = scanner.nextLine();

        float y = Float.parseFloat(stringa2);
        System.out.println("Il numero inserito è: " + y);

        // legge una stringa e la riscrive una parola per riga
        System.out.println("inserisci una frase: ");
        stringa = scanner.nextLine();

        String[] parole = stringa.split(" ");
        for (int i = 0; i < parole.length; i++) {
            System.out.println(parole[i]);
        }

        // legge una stringa e stampa i primi 5 caratteri
        System.out.println("inserisci una parola di almeno 6 caratteri: ");
        stringa = scanner.nextLine();
        System.out.println(stringa.substring(0, 5));

        // legge una stringa e ne stampa gli ultimi 5 caratteri
        System.out.println("inserisci una parola di almeno 6 caratteri: ");
        stringa = scanner.nextLine();
        System.out.println(stringa.substring(stringa.length() - 5));

        // legge una frase e stampa la parola piu lunga
        System.out.println("inserisci una frase: ");
        stringa = scanner.nextLine();
        parole = stringa.split(" ");

        x = 0;

        for (int i = 0; i < parole.length; i++) {
            if (parole[i].length() > parole[x].length()) {
                x = i;
            }
        }

        System.out.println("la parola piu lunga e: " + parole[x]);        
    }
    

    
}