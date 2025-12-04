public class Kare implements Sekil {
    private double kenar;

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public double alan() {
        return kenar * kenar;
    }
}
