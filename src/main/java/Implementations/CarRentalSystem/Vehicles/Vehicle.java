package Implementations.CarRentalSystem.Vehicles;

public abstract class Vehicle {

    protected String registrationNumber;
    protected String model;
    protected String makeYear;
    protected Condition condition;
    protected Double perHourRentalPrice;
    protected Color color;

    Vehicle(String registrationNumber,
            String model,
            String makeYear,
            Condition condition,
            Double perHourRentalPrice,
            Color color){
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.makeYear = makeYear;
        this.condition = condition;
        this.perHourRentalPrice = perHourRentalPrice;
        this.color = color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(String makeYear) {
        this.makeYear = makeYear;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Double getPerHourRentalPrice() {
        return perHourRentalPrice;
    }

    public void setPerHourRentalPrice(Double perHourRentalPrice) {
        this.perHourRentalPrice = perHourRentalPrice;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
