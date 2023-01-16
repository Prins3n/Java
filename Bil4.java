/**Bil4
 * 
 */

public class Bil4 {
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
    public void start() {
        this.motorenIGang = true;
        this.hastighet = 0;
    }
    public void økFarten(int økning) {
        this.hastighet = this.hastighet + økning;
    }
    public void brems(int minskning) {
        this.hastighet = this.hastighet - minskning;
    }
    public void stopp() {
        this.motorenIGang = false;
        this.hastighet = 0;        
    }

   
   public Bil4(String regnr, String merke, int aarsModell) {
    this.regnr = regnr;
    this.merke = merke;
    this.aarsModell = aarsModell;
    this.hastighet = 0;
    this.motorenIGang = false;
}

}