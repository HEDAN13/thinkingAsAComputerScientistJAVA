public class Nombre {
    public static void main(String[] args) {
        String nombre = "abecedo";
        String otro = "ABECEDu";
        
        System.out.println(compararNombre(nombre, otro));
    }

    public static boolean tieneComa(String s) {
        return s.contains(",");
    }

    public static String convertirNombre(String s) {
        if (tieneComa(s)) {
            return s;
        }
        return s.substring(s.indexOf(" ") + 1) + ", " + s.substring(0, s.indexOf(" "));
    }

    public static int compararNombre(String nombre1, String nombre2) {
        int comparacion = nombre1.toLowerCase().compareTo(nombre2.toLowerCase()); 
        if (comparacion == 0) {
            return 0;
        }
        return comparacion/Math.abs(comparacion);
    }
}
