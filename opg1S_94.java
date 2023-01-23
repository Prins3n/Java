/**
 * Sett opp if-setninger for følgende:
 * a) hvis antall er større enn 20, skal kode settes til 'M' for mange. ellers skal koden få verdien 'F' for få.
 * b) Hvis "body mass index" (BMI) er større enn 25, skriv ut "Du er for tung",
 * ellers skal det ikke skje noe. BMI beregnes etter formelen (vekt / (høyde * høyde)). Vekt måles i kilo, høyden i meter.
 * 
 * Konklusjon: SKIKKELIG DUMT PROGRAM
 */

import static javax.swing.JOptionPane.*;
class opg1S_94 {
    public static void main(String[] args) {
        int antall = 10;
        String kode = "";
        if (antall > 20){
            kode = "M";
        } else {
            kode = "F";
        }
        System.out.println(kode);

        String vektLest = showInputDialog("Skriv inn vekten din: ");
        String hoeydeLest = showInputDialog("Skriv inn høyden din: ");
        double vekt = Double.parseDouble(vektLest);
        double hoeyde = Double.parseDouble(hoeydeLest);
        double bmi = (vekt / (hoeyde * hoeyde));

        if (bmi > 25){
            System.out.println("Du er for tung.");
        }
    }
}
