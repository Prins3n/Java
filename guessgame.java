/**Guess Game
1. Les inn en tekst (teksten kan være tom, mao. "") gjort   
2. Les inn et tegn (tegnet må tastes inn) gjort
3. Tell opp antall forekomster av tegnet i teksten gjort
3. Spør om brukeren ønsker å gjette hvor mange forekomster det er
4. Så lenge brukeren ønsker å gjette og brukeren ikke har gjettet riktig: 
5. La brukeren gjette antall forekomster
6. Skriv ut antall forekomster av tegnet i teksten
*/

 import static javax.swing.JOptionPane.*;
 class guessgame {
     public static void main (String[] args) {
         String tekstFraBruker = showInputDialog("Skriv inn en tekst"); //1
         String tegnFraBruker = showInputDialog("Skriv inn tegnet vi skal sjekke"); //2

         char tegnViSjekker = tegnFraBruker.charAt(0); //nå har vi tegnet.
         int antall = 0;

         for (int i=0; i < tekstFraBruker.length(); i++) {
            if (tekstFraBruker.charAt(i) == tegnViSjekker)
               antall++;
         }
        

         String vilGjette = showInputDialog("Vil du gjette? j for ja og n for nei");
         while (vilGjette.equals("j")) {
             String gjett = showInputDialog("Hvor mange forekomster tror du det er?");
             int brukerGjett = Integer.parseInt(gjett);
             if (antall == brukerGjett) {
                System.out.println(antall + " det var helt riktig antall");
                break;
             } else {
                String nyGjett = showInputDialog("Vil du gjette igjen? j for ja og n for nei");
                if (nyGjett.equals("n")) {
                    break;
                }
             }
         }
         System.out.println(tekstFraBruker);
         System.out.println(tegnViSjekker);
     }
 }