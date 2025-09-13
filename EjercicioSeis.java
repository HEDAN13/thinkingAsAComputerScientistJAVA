public class EjercicioSeis {
    // Este método cuenta cuantos parentesis de apertura y cierre hay. Devuelve un valor positivo si los de apertura superan a los de cierre, en caso contrario retorna un valor negativo y en  los casos donde no haya parentesis o que las cantidades se encuntren igualadas, retornará 0.
    public static int encontrarFuncionNoCerrada(String s) {
        int largo = s.length(), i = 0, cont = 0;

        while (i < largo) {
            char c = s.charAt(i);

            if (c == '(') {
                cont += 1;
            } else if (c == ')') {
                cont -= 1;
            }
            i += 1;
        }
        return cont;
    } 

    public static double raizCuadrada(double a) {
        double x = a/2; // valor inicial x0
        double i = 0;
        while (Math.abs(i - x) > 0.0001) {
            i = (x+a/x)/2; //x1
            x = (i+a/i)/2;
        }
        return x;
    }

    public static void main(String[] args) {
        // String prueba = "((3+7 ((((* 2)";
        // System.out.println(encontrarFuncionNoCerrada(prueba));
        double i = 64.0;
        System.out.println(raizCuadrada(i));
        System.out.println(Math.sqrt(i));
    }
}
