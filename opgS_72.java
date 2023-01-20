class opgS_72 {
    public static void main(String [] args) {
        int a = 10;
        int b = 5;
        int c = 3;
        int d = 2;
        double p = 2.8;
        double q = 3.3;
        //oppgaver side 72 i boken "Programmering i Java"
        // Oppgave 3 nedenfor.
        System.out.println("Oppgave 3");
        System.out.println(c + d * a); //1
        System.out.println(a * b / c + a); //2
        System.out.println(c % d); //3
        System.out.println(d % c); //4
        System.out.println(p % q); //5
        System.out.println(q % p); //6
        System.out.println(c % d % a + b / c); //7
        System.out.println(a = b = 16); //8
        System.out.println(c % d);
        System.out.println(c % d); //testing av 7 skjer nedover her.
        System.out.println(c % d % a);
        System.out.println(b / c);
        System.out.println(c % d % a + b / c);
        //Oppgave 4 nedenfor
        System.out.println("Oppgave 4");
        System.out.println((b*b)-((4*a)*(4*c)));
        //System.out.println((x*x)+(y*y)+(z*z));
        //System.out.println(x*x*x);
        System.out.println((a-b)*(a+b));
        System.out.println(a+b);
        System.out.println(c+d);
    }
}
