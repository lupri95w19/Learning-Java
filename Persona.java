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
    // String nome;
    // String cognome;
    // int eta;
    // String colorePreferito;

    // Persona(String nome, String cognome, int eta, String colorePreferito) {
    //     this.nome = nome;
    //     this.cognome = cognome;
    //     this.eta = eta;
    //     this.colorePreferito = colorePreferito;

    // }

    void saluta() {
        System.out.println("Ciao sono " + nome);
    }

    /* Inizio esempio getters e setters */
    // Con i private abbiamo bisogno dei getters e setters
    private String nome;
    private String cognome;
    private int eta;
    private String colorePreferito;

    Persona(String nome, String cognome, int eta, String colorePreferito) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colorePreferito = colorePreferito;

    }

    // Si utilizzano quando i campi sono private
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    // Col copy abbiamo una copia di tutto, ma a differenza del semplice persona2 = persona1; la cella in memoria sarà diversa
    public void copy(Persona persona) {
        this.setNome(persona.getNome());
        this.setCognome(persona.getCognome());
    }

    // Fine esempio
}
