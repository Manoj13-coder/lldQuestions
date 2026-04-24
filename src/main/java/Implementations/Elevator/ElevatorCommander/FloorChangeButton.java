package Implementations.Elevator.ElevatorCommander;

import Implementations.Elevator.Elevator;
import Implementations.Elevator.ElevatorMovmentStrategies.ElevatorMovementStrategies;
import Implementations.Elevator.FloorInfo;

public class FloorChangeButton implements SwitchFloorButtonFunctionality{
    @Override
    public void goToFloor(Elevator elevator, int floorNumber,int members, int weight) {
        if(elevator.elevatorEntryAllowed(weight, members, floorNumber)) {
            elevator.addFloor(new FloorInfo(floorNumber, members, weight));
            elevator.setCurrentMembers(elevator.getCurrentMembers()+members);
            elevator.setCurrentWeight(elevator.getCurrentWeight()+weight);
        }
    }
}
