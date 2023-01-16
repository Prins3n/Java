

/**BilTest
 * 
 * 
 */

class Bil1Test {  
  public static void main(String[] args) {    
       /* 1. programsetning: Lager et Bil1-objekt (med referanse) minBil vha. standardkonstruktøren: */    
      bil minBil = new bil("dasdsa", "toyota", 1994, 0, false);
/* 2. programsetning: Skriver ut innholdet i minBils objektvariabler: */
      bil dinBil = new bil("rj15381", "citroen", 2013, 0, false);    
      System.out.println("regnr "+ minBil.regnr + ", merke " + minBil.merke + ", årsmodell " +  minBil.aarsModell + ", hastighet " + minBil.hastighet + ", motorenIGang " + minBil.motorenIGang);  
      System.out.println("regnr "+ dinBil.regnr + ", merke " + dinBil.merke + ", årsmodell " +  dinBil.aarsModell + ", hastighet " + dinBil.hastighet + ", motorenIGang " + dinBil.motorenIGang);  
      minBil.setHastighet(111);
      dinBil.setHastighet(222);
      System.out.println("regnr "+ minBil.regnr + ", merke " + minBil.merke + ", årsmodell " +  minBil.aarsModell + ", hastighet " + minBil.hastighet + ", motorenIGang " + minBil.motorenIGang);  
      System.out.println("regnr "+ dinBil.regnr + ", merke " + dinBil.merke + ", årsmodell " +  dinBil.aarsModell + ", hastighet " + dinBil.hastighet + ", motorenIGang " + dinBil.motorenIGang);  
     

    }
}