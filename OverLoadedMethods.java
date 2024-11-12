public class OverLoadedMethods {

    public static void main(String[] args) {
        // Overloaded methods
        // Con gli overloaded methods possiamo riscrivere le stesse funzioni ma per usarle in casistiche diverse
        // I methods vanno fuori dal public static void main
        //Inizio esempio overloaded methods 
        int doppioInt = addizione(2, 3);
        double doppioDouble = addizione(2.3, 4, 5.1);

        System.out.println(doppioInt);
        System.out.println(doppioDouble);
    }

    // Questo fuori dal public static void main
    static int addizione(int a, int b) {
        int risultato = a + b;
        return risultato;
    }

    // Stesso nome, ma parametri diversi
    static int addizione(int a, int b, int c) {
        int risultato = a + b;
        return risultato;
    }

    // Possiamo anche cambiare il tipo di dato
    static double addizione(double a, int b, double c) {
        double risultato = a + b;
        return risultato;
    }
    //Fine esempio overloaded methods */
}
