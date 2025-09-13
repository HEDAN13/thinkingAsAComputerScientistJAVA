public class Suma {
    // Suma todos los valores en un rango entre m y n
    public static int sumaRango(int m, int n) {
        if (m == n) {
            return n;
        } else {
            return m + sumaRango(m + 1, n);
        }
    }

    // Multiplica todos los valores entre m y n
    public static int multiplicarRango(int m, int n) {
        if (m == n) {
            return n;
        } else {
            return n * multiplicarRango(m, n - 1);
        }
    }

    public static double potencia(double x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * potencia(x, n-1);
    }

    public static double potenciaIterativa(double x, double n) {
        if (n == 0) {
            return 1;
        }
        int i = 1;
        double b = x;
        while (i < n) {
            b *= x;
            i += 1;
        }
        return b;
    }

    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mcd(b, a%b);
    }

    // se genera ujn bucle infifnito, ya que nunca toma valores menores que 1
    public static void ciclar(int n) {
        int i = n;
        while (i > 0) {
            System.out.println(i);
            if (i%2 == 0) {
                i = i/2;
            } else {
                i = i+1;
            }
        }
    }

    public static int factorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursivo(n - 1);
        }
    }

    public static int factorial(int n) {
        int f = 1;
        int i = n;
        while (i > 1) {
            f *= i;
            i -= 1; 
        } 
        return f;
    }

    public static double miExp(double x, int n) {
        int i = 1, den = 1;
        double e = 1, num = 1;
        while (i <= n) {
            num *= x;
            den *= i;
            e += num/den;
            i += 1;
        }
        return e;
    }

    public static double gauss(double x, int n) {
        int i = 1, den = 1;
        double g = 1, num = 1;
        while (i <= n) {
            num *= x;
            den *= i;
            g += (i+1)*num/den;
            i += 1;
        }
        return g;
    }

    public static void verificar(double x) {
        int n = 11;
        // double resto = Math.abs(Math.exp(x) - miExp(x, n));
        System.out.println(x +"\t"+ Math.exp(x) + "\t" + miExp(x,n) );
    }

    public static void main(String[] args) {
        System.out.println(mcd(80, 48));
        //ciclar(10);
        // System.out.println(potenciaIterativa(2.0, 16));
        // System.out.println(factorial(5));
        // System.out.println(factorialRecursivo(5));
        // verificar(1.0);
        // double i = 0.1;
        // while (i<=100) {
        //     verificar(i);
        //     i *= 10;
        // }
        // i = -0.1;
        // while (i>=-100) {
        //     verificar(i);
        //     i *= 10;
        // }
        // System.out.println(Math.exp(-Math.pow(1, 2)) + "\t" +gauss(1, 20));

    }
}
