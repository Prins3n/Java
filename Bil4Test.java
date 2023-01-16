/**Bil4Test
 * 
 */

class Bil4Test {  
    public static void main(String[] args) {    
         /* 1. programsetning: Lager et Bil1-objekt (med referanse) minBil vha. standardkonstruktøren: */    
        Bil4 minBil4 = new Bil4("dasdsa", "toyota", 1994);
  /* 4. programsetning: Skriver ut innholdet i minBils objektvariabler: */
        Bil4 dinBil4 = new Bil4("rj15481", "citroen", 4014);    
        System.out.println("regnr "+ minBil4.getRegnr() + ", merke " + minBil4.getMerke() + ", årsmodell " +  minBil4.getAarsModell() + ", hastighet " + minBil4.getHastighet() + ", motorenIGang " + minBil4.getMotorenIGang());
        minBil4.start();
        System.out.println("regnr "+ minBil4.getRegnr() + ", merke " + minBil4.getMerke() + ", årsmodell " +  minBil4.getAarsModell() + ", hastighet " + minBil4.getHastighet() + ", motorenIGang " + minBil4.getMotorenIGang());  
        System.out.println("regnr "+ dinBil4.getRegnr() + ", merke " + dinBil4.getMerke() + ", årsmodell " +  dinBil4.getAarsModell() + ", hastighet " + dinBil4.getHastighet() + ", motorenIGang " + dinBil4.getMotorenIGang());

        minBil4.økFarten(20);
        System.out.println("regnr "+ minBil4.getRegnr() + ", merke " + minBil4.getMerke() + ", årsmodell " +  minBil4.getAarsModell() + ", hastighet " + minBil4.getHastighet() + ", motorenIGang " + minBil4.getMotorenIGang());
        
        minBil4.økFarten(40);
        System.out.println("regnr "+ minBil4.getRegnr() + ", merke " + minBil4.getMerke() + ", årsmodell " +  minBil4.getAarsModell() + ", hastighet " + minBil4.getHastighet() + ", motorenIGang " + minBil4.getMotorenIGang());

        minBil4.brems(30);
        System.out.println("regnr "+ minBil4.getRegnr() + ", merke " + minBil4.getMerke() + ", årsmodell " +  minBil4.getAarsModell() + ", hastighet " + minBil4.getHastighet() + ", motorenIGang " + minBil4.getMotorenIGang());

        minBil4.stopp();
        System.out.println("regnr "+ minBil4.getRegnr() + ", merke " + minBil4.getMerke() + ", årsmodell " +  minBil4.getAarsModell() + ", hastighet " + minBil4.getHastighet() + ", motorenIGang " + minBil4.getMotorenIGang());
      }
  }