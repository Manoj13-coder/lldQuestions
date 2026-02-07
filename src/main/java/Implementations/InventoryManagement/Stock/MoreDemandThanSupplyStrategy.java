package Implementations.InventoryManagement.Stock;

import Implementations.InventoryManagement.Products.ProductCategory;
import Implementations.InventoryManagement.Products.ProductDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MoreDemandThanSupplyStrategy implements StockInNeedStrategy{

    @Override
    public List<ProductDetails> stockInNeed(List<ProductDetails> productDetailsList) {
        List<ProductDetails> products = new ArrayList<>();
        productDetailsList.forEach(product->{
            if(product.getPiecesSold() >= product.getQuantity())
                products.add(product);
        });
        return products;
    }

}
