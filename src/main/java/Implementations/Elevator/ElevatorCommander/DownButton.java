package Implementations.Elevator.ElevatorCommander;

import Implementations.Elevator.Elevator;
import Implementations.Elevator.ElevatorStates;

public class DownButton implements ButtonFunctionality{
    @Override
    public void pressButton(Elevator elevator) {
        elevator.setCurrentState(ElevatorStates.DOWN);
        System.out.println("Stoping Elevator for down state");
    }
}
