package Implementations.Elevator.ElevatorCommander;

import Implementations.Elevator.Elevator;
import Implementations.Elevator.ElevatorMovmentStrategies.ElevatorMovementStrategies;

public interface SwitchFloorButtonFunctionality {
    void goToFloor(Elevator elevator, int floorNumber,int members,int weight);
}
