/** Gradeomregning.java - "Programmering i Java".
 * Gradeomregnings program, som regner om Fahrenheit til Celsius.
 * men dette programmet skal ta input fra brukeren og omgjøre det brukeren taster inn.
*/

import static javax.swing.JOptionPane.*;
class GradeomregningØ2 {
    public static void main(String[] args) {  
        String fahrenheitLest = showInputDialog("Fahrenheit (grader): "); //lager en dialog boks som spør om en tekst streng som skal bli omgjort.
        double fahrenheit = Double.parseDouble(fahrenheitLest);  //omgjør svaret over som er en string til double, som da vil si desimaltall.
        double celsius = fahrenheit-32;
        double total = celsius*0.5556;
        int svar = (int)total;
        showMessageDialog(null, "Det blir " + svar + " grader celsius.");;  
     } 
 }