public class Fermat {
    public static int elevarAPotencia(int a, int b){
        return (int) Math.pow(a, b);
    }

    public static void chequearFermat(int a, int b, int c, int n) {
        if (elevarAPotencia(a, n) + elevarAPotencia(b, n) == elevarAPotencia(c, n) && n > 2) {
            System.out.println("Recorcholis, Fermat estaba equivocado!");
        } else {
            System.out.println("No, eso no funciona.");
        }
    }

    public static void main(String[] args) {
        chequearFermat(16281, 18211, 18566, 12);
    }
}
