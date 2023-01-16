class Bil2Test {  
    public static void main(String[] args) {    
         /* 1. programsetning: Lager et Bil1-objekt (med referanse) minBil vha. standardkonstruktøren: */    
        Bil2 minBil2 = new Bil2("dasdsa", "toyota", 1994, 0, false);
  /* 2. programsetning: Skriver ut innholdet i minBils objektvariabler: */
        Bil2 dinBil2 = new Bil2("rj15381", "citroen", 2013, 0, false); 
        minBil2.setHastighet(111);
        dinBil2.setHastighet(222);   
        System.out.println("regnr "+ minBil2.getRegnr() + ", merke " + minBil2.getMerke() + ", årsmodell " +  minBil2.getAarsModell() + ", hastighet " + minBil2.getHastighet() + ", motorenIGang " + minBil2.getMotorenIGang());  
        System.out.println("regnr "+ dinBil2.getRegnr() + ", merke " + dinBil2.getMerke() + ", årsmodell " +  dinBil2.getAarsModell() + ", hastighet " + dinBil2.getHastighet() + ", motorenIGang " + dinBil2.getMotorenIGang());
        
  
      }
  }