public class Narf {
    public static void sup(String pepe, int bruno) {
        System.out.println(pepe);
        if (bruno == 5) {
            ping ("no ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bis = 5;
        int bas = 2;
        sup("solo por", bis);
        clink(2*bas);
    }

    public static void clink(int tenedor) {
        System.out.print("Está el ");
        sup("desayuno", tenedor);
    }

    public static void ping(String cuerda) {
        System.out.println("cualquiera " + cuerda + "mas ");
    }
}
