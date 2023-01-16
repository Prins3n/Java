/** Oppgave 1
 * bil 
 */

public class bil {
    public String regnr;
    public String merke;
    public int aarsModell;
    public int hastighet;
    public boolean motorenIGang;

   
    public String getRegnr() {
        return regnr;
    }
    public String getMerke() {
       return merke;
   }
    public int getAarsModell() {
        return aarsModell;
    }
    public int getHastighet() {
        return hastighet;
    }
    public boolean getMotorenIGang() {
       return motorenIGang;
   }
   public void setHastighet(int hastighet) {
       this.hastighet = hastighet;
   }


    public bil(String regnr, String merke, int aarsModell, int hastighet, boolean motorenIGang) {
       this.regnr = regnr;
       this.merke = merke;
       this.aarsModell = aarsModell;
       this.hastighet = hastighet;
       this.motorenIGang = motorenIGang;
   }

   //public static void main (String [] args) {
   //
   //}
}
