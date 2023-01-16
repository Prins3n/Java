/** Øvingmodul1
 * Gradeomregning.java - "Programmering i Java".
 * Gradeomregnings program, som regner om Fahrenheit til Celsius.
*/
class Gradeomregning {
    public static void main(String[] args) {  
        double fahrenheit = 98;  
        double celsius = fahrenheit-32;
        double total = celsius*0.5556;
        int svar = (int)total;
        System.out.println("hvis det er: " + fahrenheit + " i fahrenheit, da er det " + svar + " grader i celsius");  
     } 
 }
 /*  Kjøring av programmet:
 98 grader fahrenheit er lik 36 grader i celsius.
 */