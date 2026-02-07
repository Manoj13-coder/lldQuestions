package Implementations.InventoryManagement.Products;

public class Grocery extends ProductDetails{

    public Grocery(String sku,
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
