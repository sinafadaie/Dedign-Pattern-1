package state.Exersize;

public class Main {
    public static void main(String[] args){
        DirectionService directionService = new DirectionService();
        directionService.setTravelState(new DriveState());

        directionService.getDirection();
        directionService.getEta();
    }
}
