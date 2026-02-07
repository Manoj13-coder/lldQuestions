package Implementations.InventoryManagement.Products;

public abstract class ProductDetails {

    private String sku;
    private String name;
    private double price;
    private long quantity;
    private long piecesSold;
    private ProductCategory productCategory;

    public long getPiecesSold() {
        return piecesSold;
    }

    public void setPiecesSold(long piecesSold) {
        this.piecesSold = piecesSold;
    }

    public ProductDetails(String sku,
                          String name,
                          double price,
                          long quantity,
                          ProductCategory productCategory){
        this.sku = sku;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.productCategory = productCategory;
        this.piecesSold = 0;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

}
