public class Recursion {
    // primero: devuelve el primer carácter de la cadena dada
    public static char primero(String s) {
        return s.charAt(0);
    }

    //Último: devuelve una cadena que contiene todas las letras de la cadena dada, salvo la primera
    public static String resto(String s) {
        return s.substring(1, s.length());
    }

    //largo: devuelve el largo de la cadena dada
    public static int largo(String s) {
        return s.length();
    }

    public static void imprimirCadena(String s) {
        if (s.length() > 0) {
            System.out.println(primero(s));
            imprimirCadena(resto(s));
        }
    }

    public static String invertirCadena(String s) {
        String inverso = "";
        if (s.length() > 0) {
            inverso += s.charAt(s.length()-1);
            inverso += invertirCadena(s.substring(0, s.length()-1));
        }
        return inverso;
    }

    public static void imprimirInverso(String s) {
        imprimirCadena(invertirCadena(s));
    }

    public static void main(String[] args) {
        String prueba = "Hola, Mundo!";
        // System.out.println(primero(prueba));
        // System.out.println(resto(prueba));
        // System.out.println(largo(prueba));
        System.out.println(invertirCadena(prueba));
        // imprimirCadena(prueba);
        imprimirInverso(prueba);
    }
}
