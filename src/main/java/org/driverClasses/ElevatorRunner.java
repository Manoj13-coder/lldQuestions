package org.driverClasses;

import Implementations.Elevator.Elevator;
import Implementations.Elevator.ElevatorCommander.ElevatorRemote;
import Implementations.Elevator.ElevatorMovmentStrategies.ElevatorMovementStrategies;
import Implementations.Elevator.ElevatorMovmentStrategies.MinDistanceStrategy;
import Implementations.Elevator.Floor;

import java.util.List;

public class ElevatorRunner {
    public static void main(String[] args){
        Elevator elevator1 = new Elevator(0, 1000, 10, 0, 1);
        Elevator elevator2 = new Elevator(1, 1000, 10, 0, 1);
        List<Elevator> elevators = List.of(elevator1, elevator2);
        ElevatorRemote elevatorRemote = ElevatorRemote.getElevatorRemote();
        Floor floor1 = new Floor(0, elevators);
        Floor floor2 = new Floor(1, elevators);
        floor1.setElevatorRemote(elevatorRemote);
        floor2.setElevatorRemote(elevatorRemote);
        floor1.clickElevatorUpButton(elevator1);
        floor2.clickElevatorUpButton(elevator2);
        elevatorRemote.clickToSwitchFloor(elevator1, 1, 2, 400);
        ElevatorMovementStrategies elevatorMovementStrategies = new MinDistanceStrategy();
        elevatorMovementStrategies.moveElevator(elevator1);
        System.out.println(elevator1.getCurrentFloor());
    }
}
