// Con lo scanner è possibile permettere all'utente di mettere dei dati in input
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        System.out.println("c");

        Scanner scanner = new Scanner(System.in);

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

        // In questo modo chiudo lo scanner, altrimenti presumo che vada a utilizzare sempre memoria, appunto altrimenti mi dice "Resource leak"
        scanner.close();

        System.out.println("Ciao " + nome +" " + cognome + " e hai " + eta + " anni" + " e vivi in/a " + citta);
    }
}