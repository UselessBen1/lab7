public class Site {

    public static final double TAX_RATE = 0.15;
    public static void main(String[] args) {
        LifelineSite lifelineSite = new LifelineSite(100, 1.5);
        ResidentialSite residentialSite = new ResidentialSite(200, 1.5);
        System.out.println("Lifeline Site Billable Amount: " + lifelineSite.getBillableAmount());
        System.out.println("Residential Site Billable Amount: " + residentialSite.getBillableAmount());
    }
}