/** Øvingmodul4opg1
*/
import static javax.swing.JOptionPane.*;
class juletre {
    public static void main(String[] args) {

        String antallLinjer = showInputDialog("Tast inn antall linjer du ønsker at juletreet skal være.");
        int linjerSomPrintes = Integer.parseInt(antallLinjer);

        for (int i = 1; i <= linjerSomPrintes; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}