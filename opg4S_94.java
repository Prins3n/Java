/*
 * Skriv følgende kodebit i henhold til anbefalingene for innrykk og {} gitt foran.
 * Finn verdiene til alle variablene etter at kodebiten er utført.
 * 
 * int a = 20;
 * int b = 30;
 * int p = 20;
 * int q = 40;
 * int r = 30;
 * int s = 15;
 * if (a < b) a = b; b = 10;
 * if (p == 20) q = 13; else q = 17;
 * if (r>s) { q = 100;
 * } s = 200;
 */
class opg4S_94 {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int p = 20;
        int q = 40;
        int r = 30;
        int s = 15;
        if (a < b) {
            a = b;
            b = 10;
            if (p == 20){
                q = 13;
            } else {
                q = 17;
                if (r > s) {
                    q = 100;
                } else {
                    s = 200;
                }
            }
        }
    }
}
