package Implementations.Elevator.ElevatorCommander;

import Implementations.Elevator.Elevator;
import Implementations.Elevator.ElevatorStates;

public class AlertButton implements ButtonFunctionality{
    @Override
    public void pressButton(Elevator elevator) {
        elevator.setCurrentState(ElevatorStates.ALERT);
        System.out.println("Stoping Elevator for alert state");
    }
}
