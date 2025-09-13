public class Capicua {
    public static char primera(String s) {
        if (s.length() == 0) {
            return ' ';
        }
        return s.charAt(0);
    }

    public static char ultima(String s) {
        if (s.length() == 0) {
            return ' ';
        }
        return s.charAt(s.length() - 1);
    }

    public static String medio(String s) {
        if (s.length() > 1) {
            return s.substring(1, s.length() - 1);
        } else if (s.length() == 1) {
            return s;
        }
        return "";
    }

    public static boolean esCapicua(String s) {
        boolean esCapicua = s.length() >= 0 && s.length() <= 2 && primera(s) == ultima(s);
        
        if (s.length() > 2 && primera(s) == ultima(s)) {
            esCapicua = esCapicua(medio(s));
        }
        return esCapicua;
    }
    
    public static boolean esCapicuaIter(String s) {
        int i = s.length();
        boolean esCapicua = i >= 0 && i <= 2 && primera(s) == ultima(s);
        
        while (i > 2) {
            String aux = medio(s);
            esCapicua = primera(aux) == ultima(aux);
            i--;
        }

        return esCapicua;
    }

    public static boolean esAbecedaria(String s) {
        boolean esAbecedaria = s.length() >= 0 && s.length() < 2;
        if (esAbecedaria) {
            return true;
        }
        char primeraLetra = primera(s);
        char siguienteLetra = primera(s.substring(1, s.length()));

        if (siguienteLetra >= primeraLetra && s.length() >= 2) {
            esAbecedaria = esAbecedaria(s.substring(1, s.length()));
        }
        return esAbecedaria;
    }

    public static boolean esDuodroma(String s) {
        if (s.length() < 2) {
            return false;
        }
        boolean esDuodroma = s.length() >= 2 && s.charAt(0) == s.charAt(1);
        if (s.length() > 2 && esDuodroma) {
            esDuodroma = esDuodroma(s.substring(2, s.length()));
        }
        return esDuodroma;
    }

    public static void main(String[] args) {
        String s = "áárrbbooll";

        System.out.println(esDuodroma(s));
    }
}
