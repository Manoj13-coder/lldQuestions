package Implementations.InventoryManagement.Inventory;

import Implementations.InventoryManagement.Alerts.AlertPublisher;
import Implementations.InventoryManagement.Products.ProductDetails;
import Implementations.InventoryManagement.Stock.StockInNeedStrategy;
import Implementations.InventoryManagement.Warehouse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class InventoryManager {

    List<Warehouse> availableWareHouses = new ArrayList<>();
    public static InventoryManager inventoryManager;
    AlertPublisher alertPublisher = new AlertPublisher();

    private InventoryManager(){}

    public static InventoryManager getInventory(){
        if(inventoryManager == null)
            inventoryManager = new InventoryManager();
        return inventoryManager;
    }

    public void addWareHouse(Warehouse warehouse){
        availableWareHouses.add(warehouse);
    }

    public AlertPublisher getAlertPublisher() {
        return this.alertPublisher;
    }

    public void setAlertPublisher(AlertPublisher alertPublisher) {
        this.alertPublisher = alertPublisher;
    }

    public void removeWareHouse(Warehouse warehouse){
        availableWareHouses.remove(warehouse);
    }

    public List<ProductDetails> searchInventory(SearchInventoryStrategy searchInventoryStrategy){
        return searchInventoryStrategy.getResults(availableWareHouses);
    }

    public void checkStockAndPublishAlert(StockInNeedStrategy stockInNeedStrategy,
                                          Warehouse warehouse){
        List<ProductDetails> productDetails = stockInNeedStrategy.stockInNeed(warehouse.getProducts());
        StringBuilder alertDescription = new StringBuilder();
        alertDescription.append("Please check warehouse no "+warehouse.getNumber()+" as following stock needed :");
        productDetails.forEach(product -> {
            alertDescription.append(" "+product.getName()+", ");
        });
        alertPublisher.publishAlerts(alertDescription.toString());
    }

}
