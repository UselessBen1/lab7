public class ResidentialSite {
    private double _units;
    private double _rate;
    private double base;

    public ResidentialSite(double units, double rate) {
        this._units = _units;
        this._rate = _rate;
        this.base = base;
    }

    public double getBillableAmount() {
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
