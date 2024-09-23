package fi.utu.tech.ooj.exercise3;


import fi.utu.tech.ooj.exercise3.asiakasrekisteriohjelma.AsiakasRekisteriohjelmanKaynnistin;
import fi.utu.tech.ooj.exercise3.opintorekisteri.OpintorekisterinKaynnistin;

public class Main {
    public static void main(String[] args) {
        System.out.println("DTEK0066 2024 syksy, Tehtäväkerta 3");

        /*  Tämä main-metodi on ainoa, joka tarvitaan kaikkien tehtävien suorittamiseksi.
            Alla olevat kutsut suorittavat kaikkien harjoitustehtävien ajot.
         */

        System.out.println("Tehtäväpohja käynnistyy");
        AsiakasRekisteriohjelmanKaynnistin.kaynnistaOhjelma();
        OpintorekisterinKaynnistin.kaynnistaOhjelma();

        System.out.println("Tehtävien suoritus on päättynyt");

    }
}
