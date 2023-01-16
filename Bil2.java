/**Bil2
 * 
 */
public class Bil2 {
    private String regnr;
    private String merke;
    private int aarsModell;
    private int hastighet;
    private boolean motorenIGang;

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
   public Bil2(String regnr, String merke, int aarsModell, int hastighet, boolean motorenIGang) {
    this.regnr = regnr;
    this.merke = merke;
    this.aarsModell = aarsModell;
    this.hastighet = hastighet;
    this.motorenIGang = motorenIGang;
}

}