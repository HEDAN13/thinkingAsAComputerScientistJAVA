public class Multsumados {
    public static double multsuma (double a, double b, double c){
        return (a * b + c);
    }

    public static void main(String[] args) {
        System.out.println(multsuma(2.0, 2.0, 3.0));
        System.out.println(multsuma(Math.cos(Math.PI/4.0), 0.5, Math.sin(Math.PI/4.0)));
        double cambioBase = Math.log(10);
        System.out.println(multsuma(cambioBase, 1/cambioBase, Math.log(20)/cambioBase));
        System.out.println(caramba(2.0));
    }

    public static double caramba (double x){
        return multsuma(x, Math.exp(-x), Math.sqrt(1.0-Math.exp(-x)));
    }
}
