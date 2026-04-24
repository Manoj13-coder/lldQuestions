package Implementations.Elevator;

import Implementations.Elevator.ElevatorCommander.ElevatorRemote;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int floorNumber;
    private List<Elevator> elevators;
    private int members;
    private int weight;
    private ElevatorRemote elevatorRemote;

    public Floor(int floorNumber,
                 List<Elevator> elevators){
        this.floorNumber = floorNumber;
        this.elevators = elevators;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void addElevator(Elevator elevator) {
        this.elevators.add(elevator);
    }

    public void removeElevator(Elevator elevator) {
        this.elevators.remove(elevator);
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

    public ElevatorRemote getElevatorRemote() {
        return elevatorRemote;
    }

    public void setElevatorRemote(ElevatorRemote elevatorRemote) {
        this.elevatorRemote = elevatorRemote;
    }

    public void clickElevatorUpButton(Elevator elevator){
        this.elevatorRemote.clickElevatorUpButton(elevator);
    }

    public void clickElevatorDownButton(Elevator elevator){
        this.elevatorRemote.clickElevatorDownButton(elevator);
    }

}
