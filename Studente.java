public class Studente extends PersonaPoli {
    Studente(String nome, String cognome) {
        super(nome, cognome);
    }

    @Override
    public void saluta() {
        System.out.println("Buongiorno");
    }

}
