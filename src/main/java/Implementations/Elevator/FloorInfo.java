package Implementations.Elevator;

public class FloorInfo {

    private int floorNumber;
    private int members;
    private int weight;

    public FloorInfo(int floorNumber,
                     int members,
                     int weight){
        this.floorNumber = floorNumber;
        this.members = members;
        this.weight = weight;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
