package Implementations.InventoryManagement.Alerts;

public class AdminObserver implements AlertObservers{
    @Override
    public void logAlerts(String alertMessage) {
        System.out.println(alertMessage);
    }
}
