package Implementations.Elevator;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
    private int elevatorId;
    private int maxWeight;
    private int maxMember;
    private int currentWeight;
    private int bottomFloor;
    private int highestFloor;
    private int currentMembers;
    private int currentFloor;
    private ElevatorStates currentState;
    private List<FloorInfo> floors;

    public Elevator(int elevatorId,
                    int maxWeight,
                    int maxMember,
                    int bottomFloor,
                    int highestFloor){
        floors = new ArrayList<>();
        this.elevatorId = elevatorId;
        this.maxWeight = maxWeight;
        this.maxMember = maxMember;
        this.currentWeight = 0;
        this.currentMembers = 0;
        this.currentFloor = 0;
        this.bottomFloor = bottomFloor;
        this.highestFloor = highestFloor;
        currentState = ElevatorStates.REST;
    }

    public int getElevatorId() {
        return elevatorId;
    }

    public void setElevatorId(int elevatorId) {
        this.elevatorId = elevatorId;
    }

    public boolean elevatorEntryAllowed(int weight, int members,int floorNumber){
        if(currentWeight+weight > maxWeight) {
            System.out.println("Elevator weight limit exceeds");
            return false;
        }if(currentMembers+members > maxMember) {
            System.out.println("Elevator member limit exceeds");
            return false;
        }if(!(floorNumber >= bottomFloor && floorNumber <= highestFloor)){
            System.out.println("Floor not available");
            return false;
        }return true;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int getMaxMember() {
        return maxMember;
    }

    public void setMaxMember(int maxMember) {
        this.maxMember = maxMember;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public int getCurrentMembers() {
        return currentMembers;
    }

    public void setCurrentMembers(int currentMembers) {
        this.currentMembers = currentMembers;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public ElevatorStates getCurrentState() {
        return currentState;
    }

    public void setCurrentState(ElevatorStates currentState) {
        this.currentState = currentState;
    }

    public void addFloor(FloorInfo floor){
        floors.add(floor);
    }

    public void removeFloor(FloorInfo floor){
        floors.remove(floor);
    }

    public List<FloorInfo> getFloors(){
        return new ArrayList<>(this.floors);
    }


}
