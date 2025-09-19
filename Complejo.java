public class Complejo {
    double real, imag;

    //constructor sencillo
    public Complejo() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    //constructor que toma parámetros
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void imprimirComplejo(Complejo c) {
        if (c.imag >= 0) {
            System.out.println(c.real + " + " + c.imag + "i");
        } else {
            System.out.println(c.real + " - " + (-c.imag) + "i");
        }
    }

    // conjugado es un modificador
    public static void conjugado(Complejo c) {
        c.imag = -c.imag;
    }

    // abs es una función que devuelve un valor primitivo
    public static double abs(Complejo c) {
        return Math.sqrt(c.real * c.real + c.imag * c.imag);
    }

    // suma es una función que devuelve un nuevo complejo
    public static Complejo suma(Complejo a, Complejo b) {
        return new Complejo(a.real + b.real, a.imag + b.imag);
    }

    public static void main(String[] args) {
        
        // usa el primer constructor
        Complejo x = new Complejo();
        x.real = 1.0;
        x.imag = 2.0;

        // usa el segundo constructor
        Complejo y = new Complejo(3.0, 4.0);

        System.out.println(Complejo.abs(y));

        Complejo.conjugado(x);
        Complejo.imprimirComplejo(x);
        Complejo.imprimirComplejo(y);

        Complejo s = Complejo.suma(x, y);
        Complejo.imprimirComplejo(s);
    }
}
