public class Products {
    private String productID;
    private String name;
    private Double price;
    private int stockQuantity;
    private double taxationSpecific;

    public Products(String productID,String name, Double price, int stockQuantity, double taxationSpecific) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.taxationSpecific = taxationSpecific;
    }

    public String getName() {
        return name;
    }

    public String getProductID(){
        return productID;
    }

    public void setProductID(String productID){
        this.productID = productID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public double getTaxationSpecific() {
        return taxationSpecific;
    }

    public void setTaxationSpecific(double taxationSpecific) {
        this.taxationSpecific = taxationSpecific;
    }

    public void updateProductPrice(double price){
        this.price = price;
    }
    public void updateProductStock(int stockQuantity){
        this.stockQuantity = stockQuantity;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productID='" + productID + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", taxationSpecific=" + taxationSpecific +
                "}";
    }
}
