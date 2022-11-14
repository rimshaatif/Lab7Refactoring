public abstract class Site {
    protected static final double TAX_RATE = 0.13;
    private double baseAmount;
    private double taxAmount;

    public Site(double BaseAmount, double TaxAmount) {
        this.baseAmount = BaseAmount;
        this.taxAmount = TaxAmount;

    }

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }

    abstract double getBaseAmount() ;

    abstract double getTaxAmount() ;



}
