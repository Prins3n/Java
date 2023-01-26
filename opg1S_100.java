/*
 * Kalkulator med switch.
 */

import static javax.swing.JOptionPane.*;
class opg1S_100 {
    public static void main(String[] args) {
        String tall1Lest = showInputDialog("Tall 1: ");
        String tall2Lest = showInputDialog("Tall 2: ");
        String operatorLest = showInputDialog("Operator (+ - / * %): ");
        int tall1 = Integer.parseInt(tall1Lest);
        int tall2 = Integer.parseInt(tall2Lest);
        char operator = operatorLest.charAt(0);

        switch (operator) {
            case '+':
                showMessageDialog(null, "svar: " + (tall1 + tall2));
                break;
            case '-':
                showMessageDialog(null, "svar: " + (tall1 - tall2));
                break;
            case '/':
                showMessageDialog(null, "svar: " + (tall1 / tall2));
                break;
            case '*':
                showMessageDialog(null, "svar: " + (tall1 * tall2));
                break;
            case '%':
                showMessageDialog(null, "svar: " + (tall1 % tall2));
                break;
            default:
                showMessageDialog(null, "Ugyldig operator, bruk: + - * / %");
                break;
        }
    }
}
