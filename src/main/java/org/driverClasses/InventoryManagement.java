package org.driverClasses;

import Implementations.InventoryManagement.Alerts.AdminObserver;
import Implementations.InventoryManagement.Alerts.AlertPublisher;
import Implementations.InventoryManagement.Inventory.InventoryManager;
import Implementations.InventoryManagement.Inventory.SearchProductByDecreasingQuantity;
import Implementations.InventoryManagement.Products.Electronics;
import Implementations.InventoryManagement.Products.Grocery;
import Implementations.InventoryManagement.Products.ProductCategory;
import Implementations.InventoryManagement.Products.ProductDetails;
import Implementations.InventoryManagement.Stock.MoreDemandThanSupplyStrategy;
import Implementations.InventoryManagement.Warehouse;

import java.util.List;

public class InventoryManagement {

    public static void main(String[] args){
        Warehouse warehouse1 = new Warehouse(1);
        warehouse1.addProduct(new Electronics("elect123","mobile",200,1, ProductCategory.ELECTRONICS));
        Warehouse warehouse2 = new Warehouse(2);
        warehouse2.addProduct(new Grocery("grocy123","grocery",1000,4, ProductCategory.GROCERY));
        InventoryManager inventoryManager = InventoryManager.getInventory();
        AlertPublisher alertPublisher = new AlertPublisher();
        alertPublisher.addObserver(new AdminObserver());
        inventoryManager.setAlertPublisher(alertPublisher);
        inventoryManager.addWareHouse(warehouse1);
        inventoryManager.addWareHouse(warehouse2);
        warehouse1.buyProduct("mobile", ProductCategory.ELECTRONICS);
        inventoryManager.checkStockAndPublishAlert(new MoreDemandThanSupplyStrategy(), warehouse1);
        List<ProductDetails> products = inventoryManager.searchInventory(new SearchProductByDecreasingQuantity());
    }

}
