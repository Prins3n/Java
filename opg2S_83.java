/**
 * Program som beregner hvor mange sekunder det totalt blir hvis man skriver inn 
 * x timer, x minutter og x sekunder.
 */

import static javax.swing.JOptionPane.*;

class opg2S_83  {
    public static void main(String[] args) {
        String timerLest = showInputDialog("Skriv hvor mange timer du ønsker");
        String minutterLest = showInputDialog("Skriv hvor mange minutter du ønsker");
        String sekunderLest = showInputDialog("Skriv hvor mange sekunder du ønsker");

        double doubleTimer = Double.parseDouble(timerLest);
        double doubleMinutter = Double.parseDouble(minutterLest);
        double doubleSekunder = Double.parseDouble(sekunderLest);

        double timer = (doubleTimer*60)*60; //ganger først med 60 for å få minutter, ganger det med 60 igjen for å sekunder.
        double minutt = (doubleMinutter*60); //ganger minutter med 60 for å få sekunder.

        double total = timer + minutt + doubleSekunder;

        System.out.println("det er totalt: " + total + " sekunder");

    }
    
}
