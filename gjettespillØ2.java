/** Modul 2 Oppgave 4
 * Gjette spill med bruker inntastning.
 */

import static javax.swing.JOptionPane.*;
class gjettespillØ2 {
    public static void main(String[] args) {  
        String bokstavGuess = showInputDialog("hvilken bokstav tror du det er? ");
        boolean bokstav = bokstavGuess.equals("h"); //underlig hvorfor denne blir gul?
        if (bokstav = true) {
            showMessageDialog(null, "Korrekt, bokstaven var h");
        } else {
            showMessageDialog(null, "Det var desverre feil bokstav");
        }
        String tallGuess = showInputDialog("Hvilket tall tror du det er? ");
        boolean tall = tallGuess.equals("6");
        if (tall = true) {
            showMessageDialog(null, "Korrekt, tallet var 6");
        } else {
            showMessageDialog(null, "Det var desverre feil tall");
        }
        String tekstGuess = showInputDialog("Hva tror du teksten er? ");
        boolean tekst = tekstGuess.equals("hei verden");
        if (tekst = true) {
            showMessageDialog(null, "Korrekt, teksten var heiverden");
        } else {
            showMessageDialog(null, "Det var desverre feil tekst");
        }
    }
}
