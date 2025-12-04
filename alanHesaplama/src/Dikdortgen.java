public class Dikdortgen implements Sekil {
    private double genislik;
    private double yukseklik;

    public Dikdortgen(double genislik, double yukseklik) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
    }

    @Override
    public double alan() {
        return genislik * yukseklik;
    }
}
