package Implementations.InventoryManagement.Inventory;

import Implementations.InventoryManagement.Products.ProductDetails;
import Implementations.InventoryManagement.Warehouse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchProductByIncreasingQuantity implements SearchInventoryStrategy{

    @Override
    public List<ProductDetails> getResults(List<Warehouse> warehouses) {
        List<ProductDetails> productDetails = new ArrayList<>();
        for(Warehouse warehouse: warehouses)
            productDetails.addAll(warehouse.getProducts());
        Collections.sort(productDetails,(a, b)->Long.compare(a.getQuantity(),b.getQuantity()));
        return productDetails;
    }

}
