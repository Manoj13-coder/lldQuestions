package Implementations.Elevator.ElevatorCommander;

import Implementations.Elevator.Elevator;
import Implementations.Elevator.ElevatorStates;

public class UpButton implements ButtonFunctionality{
    @Override
    public void pressButton(Elevator elevator) {
        elevator.setCurrentState(ElevatorStates.UP);
        System.out.println("Stoping Elevator for up state");
    }
}
