public class ResidentialSite extends Site{
    public ResidentialSite(){
        super();
    }
    public double getBillableAmount(double units, double rate){
        double base = units * rate * 0.5;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
