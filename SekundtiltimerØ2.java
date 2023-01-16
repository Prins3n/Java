/** Sekundtiltimer. Modul 2 oppgave 3.
 * Omgjørings program som skal gjør om sekunder som brukeren taster inn til timer og minutter.
 * 
 */

import static javax.swing.JOptionPane.*;
class SekundtiltimerØ2 {
    public static void main(String[] args) {  
        String sekunderLest = showInputDialog("Sekunder (tall): "); //skriv inn tall som teller for sekunder
        double sekunder = Double.parseDouble(sekunderLest);
        double timer = sekunder/3600;
        double minutter = (sekunder % 3600)/60;
        double sekunderer = ((sekunder % 3600) % 60) % 60;
        int svarTimer = (int)timer;
        int svarMin = (int)minutter;
        int svarsek = (int)sekunderer;
        showMessageDialog(null, "Det blir da altså " + svarTimer + " i timer, mens det blir " + svarMin + " i minutter og i sekunder blir det " + svarsek);;
    }
}
