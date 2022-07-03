package pal.paragi;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Pali";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        // tesztelés:
//        int damage = 9;
//        player.loseHealth(damage);
//        System.out.println("Lost health = " + damage);
//        System.out.println("Remaining health = " + player.healthRemained());
//        System.out.println();
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemained());

        EnhancedPlayer player = new EnhancedPlayer("Pali", 50, "Sword");
        System.out.println("Initial health = " + player.getHealth()); // ellenőrzés, hogy valóban a fent megadott érték érvényes-e az EnhancedPlayer-ben definiált initial értéket felülírva
        // ha az if feltételnél kisebb vagy nagyobb értéket definiálunk fentebb, akkor az EnhancedPlayerben definiált initial érték lesz érvényes






    }

}
