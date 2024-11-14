import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        // Iterator
        ArrayList<String> persone = new ArrayList<String>();
        // Il next partirà non da Luca, ma dal codice sopra, quindi ArrayList <String>...
        persone.add("Alberto");
        persone.add("Luca");
        persone.add("Gianni");
        persone.add("Ignazio");

        // Iterator di tipo String, come le persone
        // Iterator ha bisogno delle reference e non delle primitive, quindi non int ma Integer in caso
        Iterator<String> it = persone.iterator();
        System.out.println(it.next());

        System.out.println("Qui inizia il ciclo while");
        while (it.hasNext()) {
            String persona = it.next();
            if (persona == "Ignazio") {
                it.remove();
            }
        }

        // Qui stampiamo persone, che sarebbe l'arrayList aggiornato, dopo i controlli del while
        System.out.println(persone);
    }
}
