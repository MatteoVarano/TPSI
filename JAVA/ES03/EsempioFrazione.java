import java.util.Scanner;

class Frazione {
    // Campi
    private int numeratore;
    private int denominatore;
    // Costruttore

    public Frazione(int numeratore, int denominatore) {
        this.numeratore = numeratore;
        this.denominatore = denominatore;
    }

    public void semplifica(){
       int div;

       do{
        div = calcolaMCD(numeratore, denominatore);
        numeratore /= div;
        denominatore /= div;
       }
       while(div != 1);
    }
        
        public int calcolaMCD(int a, int b) {
        int t,r;
        if (a<b)
        {
            t = a;
            a=b;
            b=t;
        }

        do {
            r = a % b;
            if (r == 0) return b;
            a = b;
            b = r;
        }while(r!=0);

        return 0;
    }


    public Frazione moltiplica(Frazione altra) {
        int newNumerator = this.numeratore * altra.numeratore;
        int newDenominator = this.denominatore * altra.denominatore;
        
        // Semplifica la frazione se necessario
        int MCD = calcolaMCD(newNumerator, newDenominator);
        newNumerator /= MCD;
        newDenominator /= MCD;
        
        return new Frazione(newNumerator, newDenominator);
    }

    public Frazione sottrai(Frazione altraFrazione){
        int nuovoNumeratore = this.numeratore * altraFrazione.denominatore
                - altraFrazione.numeratore * this.denominatore;
        int nuovoDenominatore = this.denominatore * altraFrazione.denominatore;

        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }
    

    public Frazione dividi(Frazione altra){

        int a;

        a=altra.numeratore;
        altra.numeratore=altra.denominatore;
        altra.denominatore=a;


        int nuovoNumeratore = this.numeratore * altra.numeratore;
        int nuovoDenominatore = this.denominatore * altra.denominatore;      
       
        return new Frazione(nuovoNumeratore, nuovoDenominatore);
    }

    @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }

}

public class EsempioFrazione{

    public static void main(String[] args) {
        // Creazione di due frazioni
        Frazione frazione1 = new Frazione(4, 6);
        Frazione frazione2 = new Frazione(3, 4);

        // Stampa delle frazioni
        System.out.println("Frazione 1: " + frazione1);
        System.out.println("Frazione 2: " + frazione2 + "\n");

        //stampa semplifica
        frazione1.semplifica();
        System.out.println("Prima frazione semplificata: " + frazione1);
        frazione2.semplifica();
        System.out.println("Seconda frazione semplificata: " + frazione2+ "\n");

        //moltiplica
        Frazione moltiplica = frazione1.moltiplica(frazione2);
        System.out.println("Frazione moltiplicata: " + moltiplica + "\n" );

        //sottrai
        Frazione sottrai = frazione1.sottrai(frazione2);
        System.out.println("Sottrazione: " + sottrai + "\n");

        Frazione dividi = frazione1.dividi(frazione2);
        System.out.println("Divisione: " + dividi + "\n");
    }
}    




