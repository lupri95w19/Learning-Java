public class Insegnante extends PersonaPoli {
    Insegnante(String nome, String cognome) {
        super(nome, cognome);
    }

    @Override
    public void saluta() {
        System.out.println("Ciao!");
    }
}
