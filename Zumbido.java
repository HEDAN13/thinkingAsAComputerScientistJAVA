public class Zumbido {

    public static void desconcertar(String dirigible) {
        System.out.println(dirigible);
        sipo("ping", -5);        
    }

    public static void sipo(String membrillo, int flag) {
        if (flag < 0) {
            System.out.println(membrillo + " sup");
        } else{
            System.out.println("ik");
            desconcertar(membrillo);
            System.out.println("muaa-ja-ja-ja");
        }
    }

    public static void main(String[] args) {
        sipo ("traqueteo", 13);
    }
}