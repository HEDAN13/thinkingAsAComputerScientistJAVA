public class Prueba {
    public static void main(String[] args) {
        boolean primerBool = true, segundoBool = false;
        char primerChar = '1', segundoChar = 'p';
        int primerInt = 5, segundoInt = 2;
        String primeString = "Hola", segundoString = "22";

        System.out.print("boolean + boolean: ");
        System.out.println("undefined");
        System.out.print("boolean + char: ");
        System.out.println("undefined");
        System.out.print("boolean + int: ");
        System.out.println("undefined");
        System.out.print("boolean + String: ");
        System.out.println(primerBool + primeString);
        System.out.println("");
        System.out.print("char + boolean: ");
        System.out.println("undefined");
        System.out.print("char + char: ");
        System.out.println(primerChar + segundoChar);
        System.out.print("char + int: ");
        System.out.println(primerChar + primerInt);
        System.out.print("char + String: ");
        System.out.println(primerChar + primeString);
        System.out.println("");
        System.out.print("int + boolean: ");
        System.out.println("undefined");
        System.out.print("int + char: ");
        System.out.println(primerInt + segundoChar);
        System.out.print("int + int: ");
        System.out.println(segundoInt + primerInt);
        System.out.print("int + String: ");
        System.out.println(primerInt + segundoString);
        System.out.println("");
        System.out.print("String + boolean: ");
        System.out.println(segundoString + segundoBool);
        System.out.print("String + char: ");
        System.out.println(primeString + segundoChar);
        System.out.print("String + int: ");
        System.out.println(segundoString + primerInt);
        System.out.print("String + String: ");
        System.out.println(primeString + segundoString);
        System.out.println("");
        System.out.println(segundoChar++);
        //segundoChar = segundoChar+'1';
        System.out.println();
    }
}
