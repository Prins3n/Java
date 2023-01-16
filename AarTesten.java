/**
 * Årtest oppgave 1 modul 6 JAVA.
 * 
 */

import static javax.swing.JOptionPane.*;

class Year {
    private final int year;

    public Year(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int lastYear() {
        return year - 1;
    }

    public int nextYear() {
        return year + 1;
    }

    public int inFewYears(int number) {
        return year + number;
    }
    public boolean isLeapYear () { //enklere oppsett av skuddår
        return ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)); 
    }
}


class AarTesten {
    public static void main(String [] args) {
        String yearRead = showInputDialog("Skriv inn Arstallet du vil sjekke"); //ber om årstall
        int theYear = Integer.parseInt(yearRead); //omgjør årstallet fra string til int
        Year year = new Year(theYear); //lager en variabel av typen "Year"

        String tekst =  "Året er " + year.getYear() + "\n"
            + "Ifjor var året " + year.lastYear() + "\n"
            + "Neste år er " + year.nextYear() + "\n"
            + "For årsiden var det " + year.inFewYears(-5) + "\n"
            + "Om 5 år er året " + year.inFewYears(5);
        if (year.isLeapYear()) { //hvis sant gjør dette.
            tekst += "\n" + theYear + "er et skudd år.";
        } else { //eller så gjør programmet dette.
            tekst += "\n" + theYear + " Er ikke et skudd år";
        }
        showMessageDialog(null, tekst);
    }
}