
// Con gli ArrayList possiamo creare degli array senza una dimensione fissa
import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        // ArrayList
        // Gli array in java quando vengono inizializzati, devono essere inizializzati già sapendo quale sarà il loro valore massimo, oltre quello non si potrà eccedere
        // Con gli ArrayList invece possiamo raggirare questa imposizione
        // Ma funzionano solamente con le reference, quindi saranno più lenti
        /* Inizio esempio ArrayList */
        ArrayList<String> persone = new ArrayList();
        // Se non si volessero avere dei warning basta fare così
        // ArrayList<String> persone = new ArrayList<String>();

        // Si usa il .add per aggiungere
        persone.add("Luca");
        persone.add("Berto");
        // Non esiste qui il length ma il size()
        System.out.println("Primo ciclo");
        for (int i = 0; i < persone.size(); i++) {
            // get(i) si usa per prendere un determinato elemento, niente più [i]
            System.out.println(persone.get(i));
        }

        // Set
        // Col set possiamo aggiornare il dato
        persone.set(1, "Enrica");
        System.out.println("Secondo ciclo");
        for (int i = 0; i < persone.size(); i++) {
            // get(i) si usa per prendere un determinato elemento, niente più [i]
            System.out.println(persone.get(i));
        }

        // Remove
        // Rimuoviamo un singolo elemento
        persone.remove(0);
        for (int i = 0; i < persone.size(); i++) {
            // get(i) si usa per prendere un determinato elemento, niente più [i]
            System.out.println(persone.get(i));
            System.out.println(persone.size());
        }

        // Clear
        // Col clear facciamo Morgan Jones, ripuliamo tutto completamente (03X12 The Waling Dead)
        persone.clear();
        for (int i = 0; i < persone.size(); i++) {
            // get(i) si usa per prendere un determinato elemento, niente più [i]
            System.out.println(persone.size());
        }

        if (persone.size() == 0) {
            System.err.println("ArrayList vuoto");
        }

        ArrayList<ArrayList<String>> classi = new ArrayList();
        // ArrayList 2D
        ArrayList<String> classe1 = new ArrayList();
        classe1.add("Luca");
        classe1.add("Alex");

        ArrayList<String> classe2 = new ArrayList();
        classe1.add("Aldo");
        classe1.add("Giovanni");
        classe1.add("Giacomo");

        classi.add(classe1);
        classi.add(classe1);

        for (int i = 0; i < classi.size(); i++) {
            System.out.println();
            // .size() perché dobbiamo stampare tutti gli alunni, e non tutte le classi hanno gli stessi numeri di alunni
            for (int j = 0; j < classi.get(i).size(); j++) {
                System.out.print(classi.get(i).get(j) + " ");
            }
        }
    }

}