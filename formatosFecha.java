public class formatosFecha {
    public static void imprimirNorteamericano(String diaDeLaSemana, int diaDelMes, String mes, int anio){
        System.out.println(diaDeLaSemana + ", " + mes + " " + diaDelMes + ", " + anio);
    }
    public static void imprimirSudamericano(String diaDeLaSemana, int diaDelMes, String mes, int anio){
        System.out.println(diaDeLaSemana + " " + diaDelMes + " de " + mes + " de " + anio);
    }
    public static void main(String[] args) {
        String diaDeLaSemana, mes;
        int diaDelMes, anio;
        
        diaDeLaSemana = "Sábado";
        diaDelMes = 6;
        mes = "septiembre";
        anio = 2025;
        imprimirNorteamericano(diaDeLaSemana, diaDelMes, mes, anio);
        imprimirSudamericano(diaDeLaSemana, diaDelMes, mes, anio);
    }
}
