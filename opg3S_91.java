/**
 * PROGRAMME VIL IKKE KJØRE SIDEN VI IKKE HAR DEKLARERT A OG B.
 *           Spørsmåls oppgave
 * 
 * a) Hvor mange variabler deklareres i denne programbiten?
 * 
 *      Vil svare 4 i og med at man deklarere i første omgang. Men man kan også si at det er 0 siden a ikke har noen verdi.
 * 
 * b) Nummerer linjene 1-17. hva er skopet til de forskjellige variablene?
 * 
 *      tall1 og tall2 variablene finnes i hele programmet hvis a er større en 10.
 *      tall3 er teller hvis b er større enn 20 uansett siden den er med både på ifstatementen og elsestatementen.
 *      4 er kun med hvis b er større enn 20.
 * 
 * c) Hva skrives ut i utskriftsetningene hvis både (a > 10) og (b < 20) er sanne?
 *      System.out.println("tall1 = " + tall1 + ", tall2 = " + tall2); gir resultatet.
 *      tall1 = 60, tall2 = 50
 * 
 *      System.out.println("tall1 = " + tall1 + ", tall2 = " + tall2); gir resultat: 
 *      tall1 = 30, tall2 = 100
 * 
 *      System.out.println("tall3 = " + tall3 + ", tall4 = " + tall4);
 *      tall3 = 20, tall4 = 150
 * 
 * d) Hva skrives ut i utskriftsetningene hvis både (a > 10) og (b < 20) er usanne?
 * 
 *      ingenting siden alle utskrifts kommandoene er innenfor ifstatementene.
 */
class opg3S_91 {
    public static void main(String[] args) {
        if (a > 10) {
            int tall1 = 60;
            int tall2 = 50;
            System.out.println("tall1 = " + tall1 + ", tall2 = " + tall2);
            if (b < 20) {
                int tall3 = 20;
                tall1 = 30;
                tall2 = 100;
                int tall4 = tall1 + tall2 + tall3;
                System.out.println("tall1 = " + tall1 + ", tall2 = " + tall2);
                System.out.println("tall3 = " + tall3 + ", tall4 = " + tall4);
            } else {
                int tall3 = 65;
                System.out.println("tall3 = " + tall3);
            }
            System.out.println("tall1 = " + tall1 + ", tall2 = " + tall2);
        }
    }
}