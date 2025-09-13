public class hora {
    public static void main(String[] args) {
        int hora = 16, minuto = 12, segundo = 59;
        int segundosDesdeMedianoche = hora * 3600 + minuto * 60 + segundo;
        int segundosPorDia = 24 * 60 * 60;
        System.out.println("Segundos desde la medianoche:");
        System.out.println(segundosDesdeMedianoche);
        System.out.println("Segundos que quedan del día:");
        System.out.println(segundosPorDia - segundosDesdeMedianoche);
        System.out.println("Porcentaje del día:");
        System.out.println(segundosDesdeMedianoche * 100 / segundosPorDia);

    }
}
