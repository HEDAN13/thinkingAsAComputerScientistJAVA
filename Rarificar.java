public class Rarificar {
    // Este método imprime el valor del entero ingresado en binario.
    public static void rarificar(int x) {
        if (x == 0) {
            return;
        } else {
            rarificar(x/2);
        }

        System.out.print(x%2);
    }

    public static void main(String[] args) {
        rarificar(13);
        System.out.println("");
    }
}
