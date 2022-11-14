public class Site {
    protected static final double TAX_RATE = 0.13;
    private double BaseAmount;
    private double TaxAmount;

    public Site(double BaseAmount, double TaxAmount) {
        this.BaseAmount = BaseAmount;
        this.TaxAmount = TaxAmount;

    }


    public static void main(String[] args) {
        LifelineSite ls = new LifelineSite();
        ResidentialSite rs = new ResidentialSite();
        double lsAmount = ls.getBillableAmount(10, 5);
        double rsAmount = rs.getBillableAmount(10, 5);

        System.out.println("LifeLineSite Amount: "+ lsAmount + "\n" + "ResidentialSite Amount: " + rsAmount );
    }
}
