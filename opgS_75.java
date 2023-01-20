/**
 * Oppgaver side 75-76.
 * Tall omgjøringer og slikt.
 */

class opgS_75 {
    public static void main(String [] args) {
        int a = 10;
        int b = 5;
        int c = 3;
        int d = 2;
        double p = 2.8;
        double q = 3.3;
        System.out.println("Oppgave 1");
        System.out.println(p + (double) a / q);
        System.out.println(p + a / q);
        System.out.println((int) p + (int) q);
        System.out.println((int) (p + q));
        System.out.println("Oppgave 2");
        System.out.println((float)d /b); //1 tenker denne må være float for at det skal kunne gå
        System.out.println("dette er feil\nSvar: \n" + d /b);
        System.out.println(d * c); //2
        System.out.println(p + q); //3
        System.out.println(a + 4); //4
        System.out.println("Oppgave 3");
        long j = 2000000000 * 30;
        long k = 2000000000L * 30L;
        System.out.println("a = " + j +", b = " + k);
        System.out.println(j);
        System.out.println(k);
    }
}
