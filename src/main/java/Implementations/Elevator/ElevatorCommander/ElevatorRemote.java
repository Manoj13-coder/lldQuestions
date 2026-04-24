package Implementations.Elevator.ElevatorCommander;

import Implementations.Elevator.Elevator;

public class ElevatorRemote {

    ButtonFunctionality buttonFunctionality;
    SwitchFloorButtonFunctionality switchFloorButtonFunctionality;
    private static ElevatorRemote elevatorRemote;

    private ElevatorRemote(){}

    public static ElevatorRemote getElevatorRemote(){
        if(elevatorRemote == null)
            elevatorRemote = new ElevatorRemote();
        return elevatorRemote;
    }

    public void clickElevatorUpButton(Elevator elevator){
        buttonFunctionality = new UpButton();
        buttonFunctionality.pressButton(elevator);
    }

    public void clickElevatorDownButton(Elevator elevator){
        buttonFunctionality = new DownButton();
        buttonFunctionality.pressButton(elevator);
    }

    public void clickElevatorAlertButton(Elevator elevator){
        buttonFunctionality = new AlertButton();
        buttonFunctionality.pressButton(elevator);
    }

    public void clickToSwitchFloor(Elevator elevator, int toFloor, int members, int weight){
        switchFloorButtonFunctionality = new FloorChangeButton();
        switchFloorButtonFunctionality.goToFloor(elevator, toFloor, members, weight);
    }

}
