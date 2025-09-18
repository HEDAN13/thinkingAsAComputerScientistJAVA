import java.awt.*;
public class EjercicioOcho {
    public static void main(String[] args) {
        //8.1
        // int x = 5;
        // Point nada = new Point (1,2);

        // System.out.println(pepe (x, nada));
        // System.out.println(x);
        // System.out.println(nada.x);
        // System.out.println(nada.y);

        //8.2
        // Point nada = new Point(5, 8);

        // Rectangle rect = new Rectangle(0, 2, 4, 4);
        // Point centro = buscarCentro(rect);

        // double dist = distancia(centro, nada);

        // System.out.println(dist);

        //8.3
        Rectangle caja1 = new Rectangle(2, 4 , 7, 9);
        Point p1 = buscarCentro(caja1);
        imprimirPunto(p1);

        caja1.grow(1, 1);
        Point p2 = buscarCentro(caja1);
        imprimirPunto(p2);

        //p1 y p2 no son alias, ya que el metodo buscar centro retorna un nuevo punto, así que si bien los valores son los mismos, porque grow no mueve el centro del rectangulo, no hacen referencia al mismo punto
    }

    public static int pepe(int x, Point p) {
        x = x + 7;
        return x + p.x + p.y;
    }

    public static double distancia(Point p1, Point p2) {
        int dx = p1.x - p2.x;
        int dy = p1.y - p2.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public static Point buscarCentro(Rectangle caja) {
        int x = caja.x + caja.width/2;
        int y = caja.y + caja.height/2;
        return new Point(x, y);
    }

    public static void imprimirPunto(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }
}
