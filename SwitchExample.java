public class SwitchExample {
    public static void main(String[] args) {
        String nome = "Luca";
        switch (nome) {
            case ("Luca"):
                // Puro scopo dimostratativo, ovviamente in una scena reale si andrebbe direttamente di variabile nome
                System.out.println("Ciao Luca");
                // Il break va sempre usato altrimenti non si chiude il case
                break;
            case ("Melvin"):
                System.out.println("Ciao Melvin");
                break;
        }
    }
}
