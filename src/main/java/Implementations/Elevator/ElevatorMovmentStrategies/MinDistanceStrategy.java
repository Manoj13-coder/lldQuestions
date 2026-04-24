package Implementations.Elevator.ElevatorMovmentStrategies;

import Implementations.Elevator.Elevator;
import Implementations.Elevator.ElevatorStates;
import Implementations.Elevator.FloorInfo;

import java.util.List;
import java.util.Objects;

public class MinDistanceStrategy implements ElevatorMovementStrategies{
    @Override
    public void moveElevator(Elevator elevator) {
        int currentFloor = elevator.getCurrentFloor();
        FloorInfo nextFloor = null;
        int minDiff = (int)1e9;
        for(FloorInfo floorInfo:elevator.getFloors()){
            if(Math.abs(floorInfo.getFloorNumber()-currentFloor) < minDiff){
                minDiff = Math.abs(floorInfo.getFloorNumber()-currentFloor);
                nextFloor = floorInfo;
            }
        }
        if(Objects.nonNull(nextFloor)) {
            System.out.println("moved elevator to floor no. "+nextFloor.getFloorNumber());
            if(nextFloor.getFloorNumber() > currentFloor) {
                elevator.setCurrentState(ElevatorStates.UP);
            }else if(nextFloor.getFloorNumber() < currentFloor) {
                elevator.setCurrentState(ElevatorStates.DOWN);
            }else {
                elevator.setCurrentState(ElevatorStates.REST);
            }
            elevator.setCurrentFloor(nextFloor.getFloorNumber());
            elevator.setCurrentMembers(elevator.getCurrentMembers()-nextFloor.getMembers());
            elevator.setCurrentWeight(elevator.getCurrentWeight()-nextFloor.getWeight());
            elevator.removeFloor(nextFloor);
        }
        if(Objects.isNull(nextFloor)) {
            elevator.setCurrentState(ElevatorStates.REST);
        }
    }
}
