import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LavorareConIFile {

    public static void main(String[] args) {
        // Lavorare con i file
        File file = new File("prova.txt");
        if (file.exists()) {
            System.out.println("Il file esiste");
        } else {
            System.out.println("Il file non esiste");
        }

        // Il patch non è case sensitive
        // Possiamo usare \\ rigorosamente doppi (altrimenti vengono visti come escape) oppure /
        // Se usiamo / possiamo far girare tutto su Windows, Mac, e Linux
        // File fileInCartella = new File("F:\\Corsi\\Learning-Java\\file\\provaInCartella.txt");
        // if (fileInCartella.exists()) {
        //     System.out.println("Il file esiste");
        //     System.out.println("Il percorso è " + file.getPath());
        //     System.out.println("Il percorso assoluto è " + file.getAbsolutePath());
        // } else {
        //     System.out.println("Il file non esiste");
        // }

        // Percorso relativo
        File fileInCartella = new File(".\\file\\provaInCartella.txt");
        if (fileInCartella.exists()) {
            System.out.println("Il file esiste");

            // Stampa il nome del file
            System.out.println("Il percorso è " + file.getPath());

            // Stampa il percorso e il nome del file, il percorso che vede windows, non quello che abbiamo scritto sopra col .
            System.out.println("Il percorso assoluto è " + file.getAbsolutePath());

            // True o false
            System.out.println(fileInCartella.isFile());

            // Questo cancella il file
            // fileInCartella.delete();
        } else {
            System.out.println("Il file non esiste");
        }

        // Va fatto sempre in un try catch, perché è considerato come codice pericoloso perché potrebbe dare errore
        try {
            // Se il file non esiste, lo crea da solo e ci scrive tutto
            // Il write però scrive tutto quello che mettiamo e cancella tutto quello che c'era prima
            FileWriter writer = new FileWriter("./file/provaInCartellaWriter.txt");
            writer.write("Ciao \nSono andato a capo.");

            // Con append possiamo aggiungere qualcosa, senza sostituire quello che c'era prima
            writer.append("\nQuesto è stato aggiunto dopo");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Anche lui ha bisogno del try catch

        // Dichiarazione del reader fuori dal blocco try per poterlo usare nel finally
        FileReader reader = null;
        try {
            reader = new FileReader("./file/provaInCartellaWriter.txt");
            int data = reader.read();
            // In questo caso darà 67, ovvero il valore della lettera C in ASCII
            System.out.println(data);
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }

            // Eccezione che il file manca
        } catch (FileNotFoundException e) {
            e.printStackTrace();

            // Eccezione nel caso non riesca a leggere
        } catch (IOException e) {
            e.printStackTrace();

            // Purtroppo va fatto anche questo con try e catch
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
