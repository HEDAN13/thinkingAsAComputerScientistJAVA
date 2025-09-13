public class Misterio {
    //Este método imprime la posición de cada caracter de una cadena del último al primero y devuelve el texto invertido.
    public static String bing(String s) {
        int i = s.length() - 1;
        String total = "";

        while (i >= 0) {
            char ch = s.charAt(i);
            System.out.println(i + "     " + ch);

            total = total + ch;
            i--;
        }
        return total;
    }

    public static void main(String[] args) {
        // System.out.println(bing("Allen"));

        int numero = 17;
        int ultimoDigito = numero%10;
        int primerDigito = numero/10;
        System.out.println(ultimoDigito+""+primerDigito);
    }
}
