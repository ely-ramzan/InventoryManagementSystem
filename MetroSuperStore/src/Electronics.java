public class Electronics extends Products{
    private int PowerConsumption;
    private double  years;

    public Electronics(String productID, String name, Double price, int stockQuantity, double taxationSpecific, int powerConsumption, double years) {
        super(productID, name, price, stockQuantity, taxationSpecific);
        PowerConsumption = powerConsumption;
        this.years = years;
    }

    public int getPowerConsumption() {
        return PowerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        PowerConsumption = powerConsumption;
    }

    public double getYears() {
        return years;
    }

    public void setYears(double years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "PowerConsumption=" + PowerConsumption +
                ", years=" + years +
                '}' + super.toString();
    }
}
