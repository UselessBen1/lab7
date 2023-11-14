public abstract class Site {

    public static final double TAX_RATE = 0.15;

    public abstract double getBaseAmount();

    public abstract double getTaxAmount();


    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }

    public static void main(String[] args) {
        // Example instantiation and usage:
        Site residentialSite = new ResidentialSite(150, 0.07);
        Site lifelineSite = new LifelineSite(100, 0.05);

        System.out.println("Residential Site Billable Amount: " + residentialSite.getBillableAmount());
        System.out.println("Lifeline Site Billable Amount: " + lifelineSite.getBillableAmount());
    }

}