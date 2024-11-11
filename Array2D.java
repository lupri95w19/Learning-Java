public class Array2D {
    public static void main(String[] args) {
        // Array 2D o multidimensionali
        String[][] classi = {
                { "Luca", "Marco", "Vincenzo" },
                { "Mario", "Filippo", "Paolo" },
                { "Emrakul", "Jin gitaxias", "Berto" },
        };

        // Senza questa new line verrebbero tutti attaccati
        // Esempio col For
        System.out.println("Esempio col For");
        for (int classe = 0; classe < classi.length; classe++) {

            for (int studente = 0; studente < classi[classe].length; studente++) {
                System.err.print(classi[classe][studente] + " ");
            }
        }

        // ForEach
        System.out.println("Esempio col ForEach");
        // Esempio col ForEach
        // Classe è un riferimento a classi che si vede sopra
        for (String[] classe : classi) {
            for (String studente : classe) {
                System.out.print(studente + " ");
            }
        }
    }
}