public class LifelineSite extends Site{
    private double _units;
    private double _rate;

    private double base;

    public LifelineSite(double units, double rate) {
        this._units = units;
        this._rate = rate;
    }

    public double getBaseAmount() {
        double base = this._units * this._rate;
        return base;
    }

    public double getTaxAmount() {
        double tax = base * Site.TAX_RATE;
        return tax;
    }
}
