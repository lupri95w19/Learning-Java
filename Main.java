
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

        // OOP
        // Creiamo un'istanza della classe in un altro file per essere più organizzati (Persona.java)
        // Esempio senza un costruttore, la classe sarà sempre uguale
        //Persona persona1 = new Persona();

        // Esempio con un costruttore, posso passare degli argomenti
        /* Inizio esempio OOP 
        Persona persona1 = new Persona("Luca", "Privitera", 23, "Viola");
        Persona persona2 = new Persona("Luca", "Rossi", 25, "Blu");
        System.out.println(persona1.cognome);
        System.out.println(persona2.cognome);
        persona1.saluta();
        Fine esempio OOP */

        // Overloaded methods
        // Con gli overloaded methods possiamo riscrivere le stesse funzioni ma per usarle in casistiche diverse
        // I methods vanno fuori dal public static void main
        /* Inizio esempio overloaded methods 
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
        Fine esempio overloaded methods */
        // Se si decommenta serve aggiungere una }

        // Modificatori di accesso, servono ad aggiungere uno strato di sicurezza aggiuntivo
        /* Inizio tabella modificatori di accesso
                        class       package     subclass        world 
        public            si          si           si             si
        protected         si          si           si             no
        default           si          si           no             no
        private           si          no           no             no
        
        Fine tabella modificatori di accesso */

        // Copiare gli oggetti
        /* Inizio esempio */
        // Creo due oggetti persona
        Persona persona1 = new Persona("Luca", "Privitera", 23, "Viola");
        Persona persona2 = new Persona("Marco", "Rossi", 12, "Azzurro");

        // Qui otterrò in output il punto dove sono salvati
        System.out.println("Inizio");
        System.out.println("Memoria di persona 1: " + persona1);
        System.out.println("Memoria di persona 2: " + persona2);
        System.out.println("Persona 1 nome: " + persona1.getNome());
        System.out.println("Persona 2 nome: " + persona2.getNome());

        //Qui otterrò i corrispettivi nomi
        /* ESEMPI con campi public 
        System.out.println(persona1.nome);
        System.out.println(persona2.nome);
        
        persona2 = persona1;
        System.out.println("Risultati dopo Persona2 = Persona1");
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona1.nome);
        System.out.println(persona2.nome);
        
        // Persona2 adesso è persona 1, come se lo avesse inglobato, infatti ha la stessa location in memoria... è una copia ma è essa stessa persona1.
        */

        /* ESEMPI con il private */
        System.out.println("Qui inizia il copy");

        // Il metodo corretto è quello del copy, perché si sarà uguale ma avrà una cella di memoria diversa
        persona2.copy(persona1);
        System.out.println("Memoria di persona 1: " + persona1);
        System.out.println("Memoria di persona 2: " + persona2);

        System.out.println("Persona 1 nome: " + persona1.getNome());
        System.out.println("Persona 2 nome: " + persona2.getNome());

        // Questo fa si che persona2 diventi persona1, è come se fosse un altro modo per riferirsi a persona1, perché gli va a copiare anche la cella di memoria
        persona2 = persona1;
        System.out.println("Risultati dopo Persona2 = Persona1");
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona1.getNome());
        System.out.println(persona2.getNome());

        //Fine esempio copiare gli oggetti

    }
}