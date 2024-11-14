public class Casting {
    public static void main(String[] args) {
        // Casting 
        // Il casting ci permette di passare da un tipo di dato più piccolo a uno più grande

        // Implicitamente
        // 9 è int, ma in automatico lui lo porta a 9.0
        double x = 9;
        System.out.println("double x = 9 equivale a: " + x);

        // Il tipo float può essere automaticamente convertito in double, perché double ha una precisione maggiore
        double y = 9f;
        System.out.println("y = 9f equivale a: " + y);

        // Espliciticamente
        // Qui si perde il .8, rimane il 5
        int z = (int) 5.8;
        System.out.println("(int) 5.8 equivale a: " + z);
    }
}
