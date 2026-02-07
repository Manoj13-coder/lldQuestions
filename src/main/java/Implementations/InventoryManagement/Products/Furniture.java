package Implementations.InventoryManagement.Products;

public class Furniture extends ProductDetails{

    public Furniture(String sku,
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
