package Implementations.InventoryManagement.Alerts;

import java.util.ArrayList;
import java.util.List;

public class AlertPublisher implements AlertDeliverer{

    List<AlertObservers> observers = new ArrayList<>();

    @Override
    public void publishAlerts(String message) {
        observers.forEach(observer -> observer.logAlerts(message));
    }

    @Override
    public void addObserver(AlertObservers alertObserver) {
        observers.add(alertObserver);
    }

    @Override
    public void removeObserver(AlertObservers alertObserver) {
        observers.remove(alertObserver);
    }

}
