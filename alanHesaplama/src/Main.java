public class Main {
    public static void main(String[] args) {
        AlanFactory factory = new AlanFactory();

        Sekil k = factory.createKare(4);         // Kare oluştur
        Sekil d = factory.createDikdortgen(3, 5); // Dikdörtgen oluştur
        Sekil da = factory.createDaire(2);        // Daire oluştur

        System.out.println("Karenin Alanı: " + ((Kare)k).alan());
        System.out.println("Dikdörtgenin Alanı: " + ((Dikdortgen)d).alan());
        System.out.println("Dairenin Alanı: " + ((Daire)da).alan());
    }
}
