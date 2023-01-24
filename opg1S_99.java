/*
 * Skriv om kodingen av beslutningstabellen foran slik at du bruker 
 * "mindre enn"-tester i stedet for "større enn eller lik"-tester
 * 
 * final int MAKS = 100;
 * String poengLest = showInputDialog("Antall poeng: ");
 * int poeng = Integer.parseInt(poengLest); 
 * 
 * String melding;
 * if(poeng > 100) {
 * melding = "For stor poengsum, maks. + MAKS + ",";
 * } else if (poeng >= 96) {
 * melding = "Karakteren er A.";
 * } else if (poeng >= 86) {
 * melding = "Karakteren er B.";
 * } else if (poeng >= 71) {
 * melding = "Karakteren er C.";
 * } else if (poeng >= 55) {
 * melding = "Karakteren er D.";
 * } else if (poeng >= 36) {
 * melding = "Karakteren er E.";
 * } else if (poeng >= 0) {
 * melding = "Karakteren er F.";
 * } else {
 * melding = "Poengsummen kan ikke være negativ.";
 * }
 * showMessageDialog(null, melding);
 * 
 */


import static javax.swing.JOptionPane.*;
class opg1S_99  {
    public static void main(String[] args) {
        final int MAKS = 100;
        String poengLest = showInputDialog("Antall poeng: ");
        int poeng = Integer.parseInt(poengLest);

        String melding;
        if(poeng < 0) {
            melding = "Poengsummen kan ikke være negativ.";
        } else if (poeng < 36 && poeng > 0) {
            melding = "Karakteren er F.";
        } else if (poeng < 55) {
            melding = "Karakteren er E.";
        } else if (poeng < 71) {
            melding = "Karakteren er D.";
        } else if (poeng < 86) {
            melding = "Karakteren er C.";
        } else if (poeng < 96) {
            melding = "Karakteren er B.";
        } else if (poeng < 101) {
            melding = "Karakteren er A.";
        } else {
            melding = "For stor poengsum, maks." + MAKS + ","; //måtte bytte hele tabellen opp ned eller så fikk jeg alltid a siden alt som er mindre enn 100 ga "A"
        }
        showMessageDialog(null, melding);

    }
}
