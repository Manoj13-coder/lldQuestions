package Implementations.InventoryManagement.Products;

public class Electronics extends ProductDetails{

    public Electronics(String sku,
                       String name,
                       double price,
                       long quantity,
                       ProductCategory productCategory){
        super(sku,
                name,
                price,
                quantity,
                productCategory);
    }

}
