package Implementations.InventoryManagement.Stock;

import Implementations.InventoryManagement.Products.ProductCategory;
import Implementations.InventoryManagement.Products.ProductDetails;

import java.util.List;
import java.util.Map;

public interface StockInNeedStrategy {
    List<ProductDetails> stockInNeed(List<ProductDetails> productDetailsList);
}
