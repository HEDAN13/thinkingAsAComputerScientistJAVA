public class Nombre {
    public static void main(String[] args) {
        String nombre = "Carlos Addams";
        String otro = "Addams, Carlos";
        String nombreCodificado = capitanCrunch(otro, 13);
        String nombreDecodificado = capitanCrunch(nombreCodificado, 13);


        System.out.println(compararNombre(otro, nombreDecodificado));
        System.out.println(compararNombre(otro, convertirNombre(nombre)));
        System.out.println(nombreCodificado);
        System.out.println(nombreDecodificado);
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

    public static String capitanCrunch(String s, int codigo) {
        int i = 0;
        String resultado = "";
        
        while (i < s.length()) {
            if (!Character.isLetter(s.charAt(i))) {
                resultado += s.charAt(i);
            } else {
                char base = Character.isLowerCase(s.charAt(i)) ? 'a' : 'A';
                resultado += (char) (((s.charAt(i) - base + codigo) % 26) + base) ;
            }
            i++;
        }
        return resultado;
    }
}
