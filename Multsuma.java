public class Multsuma {
    public static void multsuma (double a, double b, double c){
        System.out.println(a * b + c);
    }

    public static void main(String[] args) {
        multsuma(2.0, 2.0, 3.0);
        multsuma(Math.cos(Math.PI/4.0), 0.5, Math.sin(Math.PI/4.0));
        double cambioBase = Math.log(10);
        multsuma(cambioBase, 1/cambioBase, Math.log(20)/cambioBase);
        caramba(2.0);
    }

    public static void caramba (double x){
        multsuma(x, Math.exp(-x), Math.sqrt(1.0-Math.exp(-x)));
    }
} 
