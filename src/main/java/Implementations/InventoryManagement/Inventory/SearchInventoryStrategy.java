package Implementations.InventoryManagement.Inventory;

import Implementations.InventoryManagement.Products.ProductDetails;
import Implementations.InventoryManagement.Warehouse;

import java.util.List;

public interface SearchInventoryStrategy {
    List<ProductDetails> getResults(List<Warehouse> warehouses);
}
