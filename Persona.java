// La classe deve essere dichiarata in un file a parte, per essere più organizzati
public class Persona {
    /* Classe statica senza costruttore 
    String nome = "Luca";
    String cognome = "Privitera";
    int eta = 23;
    String colorePreferito = "Viola";
    
    void saluta() {
        System.out.println("Ciao sono " + nome);
    }
    */

    // Classe col costruttore
    String nome;
    String cognome;
    int eta;
    String colorePreferito;

    Persona(String nome, String cognome, int eta, String colorePreferito) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;

    }

    void saluta() {
        System.out.println("Ciao sono " + nome);
    }
}
