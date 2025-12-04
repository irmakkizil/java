public class AlanFactory {

    public Sekil createKare(int kenar) {
        return new Kare(kenar);
    }

    public Sekil createDikdortgen(int kisa, int uzun) {
        return new Dikdortgen(kisa, uzun);
    }

    public Sekil createDaire(int yaricap) {
        return new Daire(yaricap);
    }
}
