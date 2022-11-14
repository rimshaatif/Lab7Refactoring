public class ResidentialSite extends Site{
    private double units;
    private double rate;
    public ResidentialSite(){
        super();
    }

    @Override
    double getBaseAmount() {
        return units*rate;

    }

    @Override
    double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE;
    }
}
