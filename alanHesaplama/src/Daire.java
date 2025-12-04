public class Daire implements Sekil {
    private double yaricap;

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alan() {
        return Math.PI * yaricap * yaricap;
    }
}
