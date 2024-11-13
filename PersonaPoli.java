public class PersonaPoli {
    String nome;
    String cognome;
    int eta;
    String colorePreferito;

    PersonaPoli(String nome, String cognome, int eta, String colorePreferito) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;
    }

    // Si possono fare anche 2 costruttori nel caso non volessimo riempire tutti i campi sempre
    PersonaPoli(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public void saluta() {
        System.out.println("Ciao");
    }
}