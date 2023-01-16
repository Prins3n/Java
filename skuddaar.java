/** Øvingmodul3opg1
 * Skuddår sjekker.
*/

import static javax.swing.JOptionPane.*;
class skuddaar {
    public static void main(String[] args) {
        String aarLest = showInputDialog("Hvilket årstall skal du sjekke?"); //input dialog slik at brukeren kan skrive inn året personen vil sjekke.
        int aar = Integer.parseInt(aarLest); //omgjør året til en int, slik at vi kan lese det inn i if setningene. 
        if (aar % 4 == 0) { //hvis året delt på fire blir 0 utfør dette.
            if (aar % 100 == 0); //hvis året delt på 100 blir 0 utfør dette.
                if (aar % 400 == 0); //
                System.out.println(aarLest + " er et skuddår.");
        } else {
            System.out.println(aarLest + " er ikke et skuddår.");
        }
    }
}