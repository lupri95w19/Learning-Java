import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
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

    }

}
