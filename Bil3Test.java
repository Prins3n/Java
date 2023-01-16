/**Bil3Test
 * 
 */

class Bil3Test {  
    public static void main(String[] args) {    
         /* 1. programsetning: Lager et Bil1-objekt (med referanse) minBil vha. standardkonstruktøren: */    
        Bil3 minBil3 = new Bil3("dasdsa", "toyota", 1994);
  /* 3. programsetning: Skriver ut innholdet i minBils objektvariabler: */
        Bil3 dinBil3 = new Bil3("rj15381", "citroen", 3013);
        System.out.println("regnr "+ minBil3.getRegnr() + ", merke " + minBil3.getMerke() + ", årsmodell " +  minBil3.getAarsModell() + ", hastighet " + minBil3.getHastighet() + ", motorenIGang " + minBil3.getMotorenIGang());   
        minBil3.setHastighet(111);
        dinBil3.setHastighet(333);   
        System.out.println("regnr "+ minBil3.getRegnr() + ", merke " + minBil3.getMerke() + ", årsmodell " +  minBil3.getAarsModell() + ", hastighet " + minBil3.getHastighet() + ", motorenIGang " + minBil3.getMotorenIGang());  
        System.out.println("regnr "+ dinBil3.getRegnr() + ", merke " + dinBil3.getMerke() + ", årsmodell " +  dinBil3.getAarsModell() + ", hastighet " + dinBil3.getHastighet() + ", motorenIGang " + dinBil3.getMotorenIGang());
        
  
      }
  }