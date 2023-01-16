/** Øvingmodul3opg2
*/


import static javax.swing.JOptionPane.*;
class Csjekk {
    public static void main(String[] args) {
        String setningLest = showInputDialog("Hvilken setning skal vi sjekke");
        int index = setningLest.indexOf("c"); //returnerer verdien til hvor i setningen bokstaven c er.
        if (index == -1) { //hvis det er ingen c så returnerer den -1, så da vet vi at det ikke er c.
            System.out.println("det er ingen c i setningen.");
        } else {
            System.out.println("det er en C i setningen og den er plassert " + index);
        }
    }   
}