
// Con lo scanner è possibile permettere all'utente di mettere dei dati in input
import java.util.Scanner;

// Con gli ArrayList possiamo creare degli array senza una dimensione fissa
import java.util.ArrayList;
import java.util.HashMap;
// Serve per gestire le eccezioni nel caso in cui abbiamo un tipo di dato che non rispecchia il dato che è stato dichiarato inizialmente, esempio int e poi mettiamo una stringa
import java.util.InputMismatchException;
import java.util.Iterator;
// Serve a lavorare con i File file = new File("prova.txt");
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Semplice print in una nuova line, System e non system altrimenti Java piange
        // System.out.println("c");

        // Esempio dello scanner
        // Scanner scanner = new Scanner(System.in);
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
        //
        //
        //
        // 
        // 
        // 
        // 
        // 
        // 
        // 
        // In questo modo chiudo lo scanner, altrimenti presumo che vada a utilizzare sempre memoria, appunto altrimenti mi dice "Resource leak"
        // Forse andava fatto sopra(?)
        // scanner.close();

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
        //
        //
        //
        // 
        // 
        // 
        // 
        // 
        // 
        // 
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
        //
        //
        //
        // 
        // 
        // 
        // 
        // 
        // 
        // 
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
        //
        //
        //
        // 
        // 
        // 
        // 
        // 
        // 
        // 
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
        //
        //
        //
        // 
        // 
        // 
        // 
        // 
        // 
        // 
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
        //
        //
        //
        // 
        // 
        // 
        // 
        // 
        // 
        // 
        // Modificatori di accesso, servono ad aggiungere uno strato di sicurezza aggiuntivo
        /* Inizio tabella modificatori di accesso
                        class       package     subclass        world 
        public            si          si           si             si
        protected         si          si           si             no
        default           si          si           no             no
        private           si          no           no             no
        
        Fine tabella modificatori di accesso */
        //
        //
        //
        // 
        // 
        // 
        // 
        // 
        // 
        // 
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
        //
        //
        //
        // 
        // 
        // 
        // 
        // 
        // 
        // 
        // Polimorfismo
        /* Inizio esempio polimorfismo
        // Studente e Insegnante estendono la classe che consente il polimorfismo
        
        Studente studente1 = new Studente("Luca", "Privitera");
        Insegnante insegnante1 = new Insegnante("Fabio", "Mollura");
        
        // Classe del polimorfismo è un array col nome classe, all'interno abbiamo studente1 e insegnante1
        PersonaPoli[] classe = { studente1, insegnante1 };
        
        // Per ogni Personapolimorfa persona che fa riferimento all'array classe, faccio un saluto
        for (PersonaPoli persona : classe) {
            persona.saluta();
        }
            Fine esempio polimorfismo */
        //
        //
        //
        // 
        // 
        // 
        // 
        // 
        // 
        // 
        /* Inizio esempio exception handling
        Scanner scanner = new Scanner(System.in);
        // Divisione per l'eccezione del x / 0
        System.out.println("Divisione");
        
        // Dichiaro fuori così posso ritrovarmela dopo nel catch
        int x = 0;
        int y = 0;
        
        // Praticamente sarebbe così, il try prova a eseguire il codice, e se trova un qualsiasi errore (in questi caso "ArithmeticException error", "InputMismatchException error" o genericamente "Exception") esegue il codice del catch
        try {
        
            System.out.println("Inserisci un numero");
            // int x = scanner.nextInt();
            x = scanner.nextInt();
        
            System.out.println("Inserisci un secondo numero");
            // int y = nextInt(); questo non andrebbe bene perché la y non arriverebbe al catch
            y = scanner.nextInt();
        
            int result = x / y;
            System.out.println("Il risultato è: " + result);
        
            scanner.close();
        } catch (ArithmeticException error) {
            System.out.println("Non puoi dividere per " + x + " per " + y);
        
            // In caso in input non arrivi un numero
        } catch (InputMismatchException error) {
            System.out.println("Non è stato inserito un numero valido");
        
            // Errore generico
        } catch (Exception error) {
            System.out.println("C'è stato un problema generico");
        
            // Infine chiudiamo lo scanner, altrimenti abbiamo un memory leak
        } finally {
            scanner.close(); // Assicurati di chiudere lo scanner qui per evitare risorse aperte
        }
            Fine esempio exception handling */
        //
        //
        //
        // 
        // 
        // 
        // 
        // 
        // 
        // 
        // Lavorare con i file
        /* Inizio esempio lavorare con i file
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
        Fine esempio lavorare con i file*/
        //
        //
        //
        // 
        // 
        // 
        // 
        // 
        // 
        // 
        /* Inizio esempio file Writer
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
         Fine esempio file writer*/
        //
        //
        //
        // 
        // 
        /* Inizio esempio file reader 
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
        Fine esempio file reader */
        //
        //
        //
        // 
        // 
        // 
        // 
        // 
        // 
        // 
        // Casting 
        /* Inizio esempio casting 
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
        
        Fine esempio casting*/
        //
        //
        //
        // 
        // 
        // 
        // 
        // 
        // 
        // 
        // Hashmap
        /* Inizio esempio Hashmap 
        // Le hashmap sono simili agli array 2d, ma ci permettono di salvare con chiave : valore
        HashMap<String, String> capitali = new HashMap<String, String>();
        
        capitali.put("Italia", "Roma");
        capitali.put("Francia", "Parigi");
        
        System.out.println("La capitale dell'Italia è: " + capitali.get("Italia"));
        
        // In caso ci sbagliassimo e volessimo rimuovere
        capitali.put("Germania", "Amburgo");
        System.out.println("La capitale della Germania è: " + capitali.get("Germania"));
        capitali.remove("Germania");
        System.out.println("La capitale della Germania è: " + capitali.get("Germania"));
        
        // Aggiungiamo il valore
        capitali.put("Germania", "Berlino");
        System.out.println("La capitale della Germania è: " + capitali.get("Germania"));
        
        // In caso la città non fosse Berlino, la mettiamo col computeIfPresent, comunque meglio utlizzare il put, molto più semplice
        capitali.put("Germania", "Amburgo");
        capitali.computeIfPresent("Germania", (key, oldValue) -> oldValue.equals("Berlino") ? oldValue : "Berlino");
        System.out.println("La capitale della Germania è: " + capitali.get("Germania"));
        
        // Pulisco tutto, cancello
        // capitali.clear();
        
        Fine esempio Hashmap*/
        //
        //
        //
        // 
        // 
        // 
        // 
        // 
        // 
        // 
        // Iterator
        /* Inizio esempio iterator
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
        
        Fine esempio iterator*/
    }
}