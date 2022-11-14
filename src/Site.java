public abstract class Site {
    protected static final double TAX_RATE = 0.13;


    public Site() {


    }

    public double getBillableAmount(){
        return getBaseAmount() + getTaxAmount();
    }

    abstract double getBaseAmount() ;

    abstract double getTaxAmount() ;



}
