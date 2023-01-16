/** Modul 2 oppgave 2.
 * Sekundomgjørings program.
 * Programmet tar input fra brukeren i timer, så minutter og tilslutt sekunder.
 * deretter skal det omgjøre dette til desimaltall for tilslutt å gi svaret.
*/

import static javax.swing.JOptionPane.*;
class SekundomgjøringØ2 {
    public static void main(String[] args) {  
        String timerLest = showInputDialog("Timer (tall): "); //skriv inn et tall som teller for timer
        String minutterLest = showInputDialog("Minutter (tall): "); //skriv inn tall som teller for minutter
        String sekunderLest = showInputDialog("Sekunder (tall): "); //skriv inn tall som teller for sekunder
        double timer = Double.parseDouble(timerLest)*3600;
        double minutter = Double.parseDouble(minutterLest)*60;
        double sekunder = Double.parseDouble(sekunderLest)*1;
        double svar = timer + minutter + sekunder;
        showMessageDialog(null, "Det blir da altså " + svar);;
    }
}


