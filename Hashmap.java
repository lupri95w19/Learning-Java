import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args) {
        // Hashmap
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
    }

}
