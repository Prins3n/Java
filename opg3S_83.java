/**
 * sekund omgjørings program
 * 
 */

import static javax.swing.JOptionPane.*;

class opg3S_83 {    
    public static void main(String[] args) {
        String sekunderLest = showInputDialog("hvor mange sekunder? ");
        int sekunder = Integer.parseInt(sekunderLest);
        int timer = (sekunder/3600);
        int minutter = (sekunder%3600)/60;
        int sek = minutter%60;
        System.out.println("Det er " + timer + " timer og " + minutter + " minutter og " + sek + " sekunder.");

    }
    
}
