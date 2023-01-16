/**Aar
 * 
 */

 public class Aar {
     private int år;
     private boolean skuddÅr;
 

     public int getÅr() {
         return år;
     }
     public int beregnIFjor(){
         int iFjor = år - 1;
         return iFjor;
     }
     public int beregnNesteÅr(){
         int nesteÅr = år + 1;
         return nesteÅr;
     }
     public int beregnOmNoenÅr(int tall){
         int omNoenÅr = år + tall;
         return omNoenÅr;
     }
     
     public Aar(int år){
         this.år = år;
     }
     public boolean isSkuddår(){
        if (år % 4 == 0) { 
            if (år % 100 == 0) {
                if (år % 400 == 0) 
                    skuddÅr = true;
                else
                    skuddÅr = false;
            }

                skuddÅr = false;
        } 
        else
            skuddÅr = false;
        
        return skuddÅr;
    }
 }