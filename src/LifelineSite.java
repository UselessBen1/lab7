public class LifelineSite {
    private double _units;
    private double _rate;

    private double base;

    public LifelineSite(double units, double rate) {
        this._units = units;
        this._rate = rate;
        this.base = base;
    }
    public double getBillableAmount() {
        double base = this._units * this._rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
