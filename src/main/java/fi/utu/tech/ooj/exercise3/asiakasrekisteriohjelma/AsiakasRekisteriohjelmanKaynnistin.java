package fi.utu.tech.ooj.exercise3.asiakasrekisteriohjelma;

import java.util.ArrayList;
import java.util.UUID;

public class AsiakasRekisteriohjelmanKaynnistin {

    public static void kaynnistaOhjelma() {
        System.out.println("------ Asiakas- ja tuoterekisteriohjelman demo käynnistyy ------");
        Asiakasrekisteri a = new Asiakasrekisteri();
        /*
        * Tämä rutiini suoritetaan automaattisesti, kun tehtäväpohja suoritetaan
        *
        * Lisää tähän Asiakas- ja tuoterekisteriohjelman demonstrointiin tarvittava koodi
        *
        * */

        class Asiakasrekisteri{

            public ArrayList<Asiakas> asiakkaat = new ArrayList<Asiakas>();
            public Asiakasrekisteri(){}

            public void poistaAsiakas(long asiakasnumero){
                for(Asiakas a : asiakkaat){
                    if(a.getAsiakasnumero() == asiakasnumero){

                    }
                }
            }

        }
        class Asiakas{
            private String nimi;
            private String katuosoite;
            private String postinumero;
            private String postitoimipaikka;
            private String puhelinnumero;
            private final long asiakasnumero;

            public Asiakas(String nimi, String katuosoite, String postinumero, String postitoimipaikka, String puhelinnumero){
                this.nimi = nimi;
                this.katuosoite = katuosoite;
                this.postinumero = postinumero;
                this.postitoimipaikka = postitoimipaikka;
                this.puhelinnumero = puhelinnumero;
                this.asiakasnumero =  UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
            }
            public long getAsiakasnumero(){
                return this.asiakasnumero;
            }
        }



        System.out.println("------ Asiakas- ja tuoterekisteriohjelman demo päättyy ------");
    }
}
