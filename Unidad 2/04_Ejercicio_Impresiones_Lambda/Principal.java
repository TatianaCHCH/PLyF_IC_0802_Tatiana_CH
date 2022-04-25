public class Principal {

    public static void main(String[] args) {

        // Ejemplo 2
        System.out.println("\n\n\n\tEjemplo 1\n");
        Principal.ejem2((Calculos)(a, b) -> a - b);
        Principal.ejem2((Calculos)(a, b) -> a * b );

        /*// Ejemplo 2 
        System.out.println("\n\n\n\tEjemplo 2");

        Function<String,Integer> sizeOf = (String s) -> {
            return s.length();
        };*/

        // Ejemplo 3
        System.out.println("\n\n\n\tEjemplo 3");
        new Thread( () -> System.out.println(" Esto es una impresion con Lambda") ).start();

    }

    // Sobrecarga de Métodos
    private static void ejem2(Calculos cal){
        int a = 9, b = 5;
        int resultado = cal.calcular(a, b);
        System.out.println("Resultado de operacion entre  " + a + "  y  " + b + "  =  " + resultado);
    }

}