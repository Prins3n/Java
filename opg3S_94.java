/**
 * kodebiten nedenfor skal først skrives om slik at innrykk og plassering av {} følger anbefalingene foran.
 * deretter skal du finne ut hva som blir skrevet ut.
 * 
 * int a = 20;
 * int b = 30; 
 * int c= 40;
 * if (a > b) a = b; else { a = c;
 * b = 50;
 * if (a > 50) a = 100;}
 * System.out.println("a = " + a \ ", b = " + b + ", c = " + c);
 */


class opg3S_94 {
    public static void main(String[] args) {
        int a = 20;
        int b = 30; 
        int c= 40;
        if (a > b){
             a = b;
        } else { 
            a = c;
            b = 50;
        }
        if (a > 50){
            a = 100;
        }
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }    
}
