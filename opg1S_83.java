/** Oppgave 1 
 * Side 83.
 * "Skriv et program som regnerom fra tommer til centimeter"
 * testdata:
 * 10 | 25.4 | resultat: 25.40
 * 5  | 12.7 | resultat: 12.70
 * 13 |    ? | resultat: 33.02
 */

import static javax.swing.JOptionPane.*;
class opg1S_83  {
    public static void main(String[] args) {
        String tommeLest = showInputDialog("Tommer: ");
        double tommer = Double.parseDouble(tommeLest);
        double centimeter = tommer*2.54;

        if (tommer > 0.0) {
            System.out.println(centimeter);
        } else {
            System.out.println("feil på tommelest.");
        }

    }
    
}
