public class ResidentialSite {
    private double _units;
    private double _rate;
    private double base;

    public ResidentialSite(double units, double rate) {
        this._units = units;
        this._rate = rate;

    }

    public double getBillableAmount() {
        double base = this._units * this._rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
