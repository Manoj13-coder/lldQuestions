package Implementations.InventoryManagement.Alerts;

public interface AlertDeliverer {
    void publishAlerts(String message);
    void addObserver(AlertObservers alertObserver);
    void removeObserver(AlertObservers alertObserver);
}
