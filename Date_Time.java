package co.develhope.introduction._14;

import java.time.LocalDate;
import java.time.Year;

public class Date_Time {
    public static void main(String[] args) {
        // Ottieni la data corrente
        LocalDate dataCorrente = LocalDate.now();

        System.out.print("Alla fine del mese mancano = ");
        System.out.print(dataCorrente.lengthOfMonth()-dataCorrente.getDayOfMonth());
        System.out.println(" giorni");

        System.out.print("Alla fine dell'anno mancano = ");
        System.out.print((Year.of(dataCorrente.getYear()).length())-dataCorrente.getDayOfYear());
        System.out.print(" giorni");
        ;

    }

}
