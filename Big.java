import java.math.BigInteger;
public class Big {
    public static BigInteger factorial(int n) {
        BigInteger f = BigInteger.valueOf(1);
        int i = n;
        while (i > 1) {
            f = f.multiply(BigInteger.valueOf(i));
            i -= 1; 
        } 
        return f;
    }

    public static BigInteger potencia(int x, int n) {
        if (n==0) return BigInteger.valueOf(1);

        // calcular x a la n/2 recursivamente
        BigInteger t = potencia(x, n/2);

        // si n es par, el resultado es t al cuadrado
        // si n es impar, el resultado es t al cuadrado por x

        if (n%2 == 0) {
            return t.multiply(t);
        } else {
            return t.multiply(t).multiply(BigInteger.valueOf(x));
        }
    }

    public static void main(String[] args) {
        // A partir del 15 los resultados ya no tienen sentido.
        // int i = 0;
        // while (i <= 30) {
        //     System.out.println("| \t" + i + "\t | \t" + factorial(i) + "\t |");
        //     i++;
        // }

        // int x = 17;
        // BigInteger chico = BigInteger.valueOf(x);
        // BigInteger grande = BigInteger.valueOf(1700000000);
        // BigInteger total = chico.add(grande);
        // total = total.multiply(grande);
        // System.out.println(total);

        //Prueba con factorial BigInteger
        // int i = 0;
        // while (i <= 30) {
        //     System.out.println("| \t" + i + "\t | \t" + factorial(i) + "\t |");
        //     i++;
        // }

        System.out.println(potencia(10, 32));
    }
}
