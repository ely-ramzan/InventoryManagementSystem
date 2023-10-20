public class Furniture extends Products{
    private String Material;
    private String Dimensions;

    public Furniture(String productID, String name, Double price, int stockQuantity, double taxationSpecific, String material, String dimensions) {
        super(productID, name, price, stockQuantity, taxationSpecific);
        Material = material;
        Dimensions = dimensions;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public String getDimensions() {
        return Dimensions;
    }

    public void setDimensions(String dimensions) {
        Dimensions = dimensions;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "Material='" + Material + '\'' +
                ", Dimensions='" + Dimensions + '\'' +
                " " + super.toString() + '}';
    }
}
