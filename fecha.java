public class Fecha {
    int anio, mes, dia;

    public Fecha() {
        this.anio = 1;
        this.mes = 1;
        this.dia = 1;
    }

    public Fecha(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }

    public static void main(String[] args) {
        String diaDeLaSemana, mes;
        int diaDelMes, anio;
        
        diaDeLaSemana = "Sábado";
        diaDelMes = 6;
        mes = "septiembre";
        anio = 2025;

        // System.out.println(diaDeLaSemana);
        // System.out.println(diaDelMes);
        // System.out.println(mes);
        // System.out.println(anio);
        //imprimir en formato argentino
        System.out.println("Formato argentino:");
        System.out.println(diaDeLaSemana + " " + diaDelMes + " de " + mes + " de " + anio);
        System.out.println("Formato americano:");
        System.out.println(diaDeLaSemana + ", " + mes + " " + diaDelMes + ", " + anio);
        System.out.println("Formato europeo:");
        System.out.println(diaDeLaSemana + " " + diaDelMes + " " + mes + ", " + anio);

        Fecha nacimiento = new Fecha(1989, 6, 16);

        System.out.print("Fecha de nacimiento: ");
        System.out.println(nacimiento.dia + "/" + nacimiento.mes + "/" + nacimiento.anio);
    }
}
