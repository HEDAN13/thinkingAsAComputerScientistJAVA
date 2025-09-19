public class Tiempo {
    int hora, minuto;
    double segundo;

    public Tiempo() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0.0;
    }

    public Tiempo(int hora, int minuto, double segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public  Tiempo(double segs) {
        this.hora = (int)(segs/3600);
        segs -= this.hora*3600;
        this.minuto = (int)(segs/60);
        this.segundo = segs - this.minuto*60;
    }

    public static void main(String[] args) {
        // una forma de crear e inicializar un objeto Tiempo
        Tiempo t1 = new Tiempo();
        t1.hora = 11;
        t1.minuto = 8;
        t1.segundo = 3.14159;
        imprimirTiempo(t1);

        // otra manera de hacer lo mismo
        Tiempo t2 = new Tiempo(11, 8, 3.14159);
        imprimirTiempo(t2);

        incrementar(t2, 4410.0);
        imprimirTiempo(t2);
    }

    public static void imprimirTiempo(Tiempo t) {
        System.out.println(t.hora + ":" + t.minuto + ":" + t.segundo);
    }

    public static boolean posterior(Tiempo tiempo1, Tiempo tiempo2) {
        if (tiempo1.hora > tiempo2.hora) return true;
        if (tiempo1.hora < tiempo2.hora) return false;
        
        if (tiempo1.minuto > tiempo2.minuto) return true;
        if (tiempo1.minuto < tiempo2.minuto) return false;

        if (tiempo1.segundo > tiempo2.segundo) return true;
        return false;        
    }

    public static Tiempo sumarTiempo(Tiempo t1, Tiempo t2) {
        double segundos = convertirASegundos(t1) + convertirASegundos(t2);
        return new Tiempo(segundos);
    }

    public static void incrementar(Tiempo t, double segundos) {
        double total = convertirASegundos(t) + segundos;
        Tiempo nuevo = new Tiempo(total);
        t.hora = nuevo.hora;
        t.minuto = nuevo.minuto;
        t.segundo = nuevo.segundo;
    }

    public static double convertirASegundos(Tiempo t) {
        return t.hora*3600 + t.minuto*60 + t.segundo;
    }
}
