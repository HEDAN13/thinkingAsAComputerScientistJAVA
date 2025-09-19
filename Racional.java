public class Racional {
    int numerador, denominador;

    public Racional() {
        this.numerador = 0;
        this.denominador = 1;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public static void imprimirRacional(Racional r) {
        System.out.println(r.numerador + "/" + r.denominador);
    }

    public static void invertirSigno(Racional r) {
        r.numerador = -r.numerador;
    }

    public static void invertir(Racional r) {
        int aux = r.numerador;
        if (aux == 0) {
            System.out.println("No se puede invertir un racional con numerador 0");
            return;
        }
        if (aux < 0) {
            aux = -aux;
            r.numerador = -r.denominador;
            r.denominador = aux;
        } else {
            r.numerador = r.denominador;
            r.denominador = aux;
        }
    }

    public static double aDouble(Racional r) {
        return (double) r.numerador / r.denominador;
    }

    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a%b);
    }

    public static Racional reducir(Racional r) {
        int m = mcd(Math.abs(r.numerador), Math.abs(r.denominador));
        return new Racional(r.numerador / m, r.denominador / m);
    }

    public static Racional suma(Racional r1, Racional r2) {
        Racional suma = new Racional();
        suma.numerador = r1.numerador * r2.denominador + r2.numerador * r1.denominador;
        suma.denominador = r1.denominador * r2.denominador;
        return reducir(suma);
    }

    public static void main(String[] args) {
        Racional r1 = new Racional(128, 84);
        //invertirSigno(r1);
        invertir(r1);
        imprimirRacional(r1);
        System.out.println(aDouble(r1));
        Racional r2 = reducir(r1);
        imprimirRacional(r1);
        imprimirRacional(r2);

        Racional r3 = new Racional(-12, 5);
        Racional r4 = new Racional(2, 5);
        imprimirRacional(suma(r3, r4));
    }
}
