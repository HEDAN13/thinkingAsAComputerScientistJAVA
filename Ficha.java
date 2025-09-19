public class Ficha {
    char letra;
    int valor;

    public Ficha(char letra, int valor) {
        this.letra = letra;
        this.valor = valor;
    }

    public static void imprimirFicha(Ficha f) {
        System.out.println(f.letra + " - " + f.valor);
    }

    public static void probarFicha() {
        Ficha f1 = new Ficha('Z', 10);
        imprimirFicha(f1);
    }

    public static void main(String[] args) {
        probarFicha();
    }
}
