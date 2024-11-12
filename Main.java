
// Con lo scanner è possibile permettere all'utente di mettere dei dati in input
import java.util.Scanner;

// Con gli ArrayList possiamo creare degli array senza una dimensione fissa
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Semplice print in una nuova line, System e non system altrimenti Java piange
        // System.out.println("c");

        // Esempio dello scanner
        Scanner scanner = new Scanner(System.in);
        /* Inizio scanner
        
        // Praticamente quello che arriverà dall'utente, verrò associato al nome
        // Sarebbe tipo "Guarda che nome deve valere 'richiedi all'utente'"
        System.out.println("Qual è il tuo nome?");
        String nome = scanner.nextLine();
        
        System.out.println("Qual è il tuo cognome?");
        String cognome = scanner.nextLine();
        
        // nextInt perché abbiamo un intero, ma ci sarà un problema, ovvero uscirà dalla line e quindi interromperà l'esecuzione dei futuri scanner
        System.out.println("Qual è la tua età?");
        int eta = scanner.nextInt();
        // Mettendo questo però, lo scanner viene mandato a capo come avviene nei Line, praticamente si forza il mandare a capo
        scanner.nextLine();
        
        System.out.println("Dove vivi?");
        String citta = scanner.nextLine();
        
        System.out.println("Ciao " + nome +" " + cognome + " e hai " + eta + " anni" + " e vivi in/a " + citta);
        
        Fine scanner*/

        // In questo modo chiudo lo scanner, altrimenti presumo che vada a utilizzare sempre memoria, appunto altrimenti mi dice "Resource leak"
        // Forse andava fatto sopra(?)
        scanner.close();

        // Switch potrebbe essere utile in alcune istanze al posto dell'if, anche se meno usato
        String nome = "Luca";

        /*Inizio esempio Scanner 
        switch (nome) {
            case ("Luca"):
                // Puro scopo dimostratativo, ovviamente in una scena reale si andrebbe direttamente di variabile nome
                System.out.println("Ciao Luca");
                // Il break va sempre usato altrimenti non si chiude il case
                break;
            case ("Melvin"):
                System.out.println("Ciao Melvin");
                break;
        }*/

        // Array 2D o multidimensionali
        /* Inizio esempio Array 2D o multidimensionali
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
        
        System.out.println("Esempio col ForEach");
        // Esempio col ForEach
        // Classe è un riferimento a classi che si vede sopra
        for (String[] classe : classi) {
            for (String studente : classe) {
                System.out.print(studente + " ");
            }
        }
        Fine esempio Array 2D o multidimensionali*/

        // Wrapper Class
        // Con le wrapper class possiamo utilizzare i metodi, per esempio .equals anche sulle primitive, ma occhio che sono più lente
        /* Inizio esempio Wrapper Class 
        
        Boolean vero = true;
        // boolean vero= true;
        
        Character prova = 'c';
        // char prova = 'c';
        
        Integer numero = 5;
        // int numero = 5;
        
        Double virgola = 2.63;
        // double virgola = 2.63;
        String stringa = "String non necessita wrapper";
        
        Fine esempio Wrapper Class*/

        // ArrayList
        // Gli array in java quando vengono inizializzati, devono essere inizializzati già sapendo quale sarà il loro valore massimo, oltre quello non si potrà eccedere
        // Con gli ArrayList invece possiamo raggirare questa imposizione
        // Ma funzionano solamente con le reference, quindi saranno più lenti
        /* Inizio esempio ArrayList
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
            Fine esempio ArrayList */
    }
}