public class LifelineSite extends Site{
    private double units;
    private double rate;
    public LifelineSite(){
        super();
    }

    @Override
    double getBaseAmount() {
        return units * rate * 0.5;
    }

    @Override
    double getTaxAmount() {
        return getBaseAmount() * Site.TAX_RATE * 0.2;
    }
}
