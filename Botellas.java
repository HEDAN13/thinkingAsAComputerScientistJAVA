public class Botellas {
    public static void botellasCerveza(int n) {
        if (n > 1){
            System.out.println("Hay " + n + " botellas de cerveza en la pared,\nhay " + n + " botellas de cerveza,\nuna sola agarrás,\ny después la pasás,\nhay " + (n - 1) + " botellas de cerveza en la pared.");
            System.out.println("");
            botellasCerveza(n-1);
        } else if (n == 1) {
            System.out.println("Hay " + n + " botella de cerveza en la pared,\nhay " + n + " botella de cerveza,\nuna sola agarrás,\ny después la pasás,\nya no hay botellas de cerveza en la pared.");
            System.out.println("");
            botellasCerveza(n-1);
        } else {
            System.out.println("No hay más botellas de cerveza en la pared,\nno hay más botellas de cerveza,\nno la agarrarás,\ny no la pasarás,\nporque no hay más botellas de cerveza en la pared.");
        }
    }

    public static void main(String[] args) {
        botellasCerveza(10);
    }
}
