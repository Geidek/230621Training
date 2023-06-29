package dhbw;

public class AutonomousForklift implements IAutonomousForklift {

    public AutonomousForklift(AIEngine aiEngine) {
        this.aiEngine = aiEngine;
        Chassis chassis = new Chassis();
        Wheel wheelBackLeft = new Wheel();
        Wheel wheelBackRight = new Wheel();
        Wheel wheelFrontLeft = new Wheel();
        Wheel wheelFrontRight = new Wheel();
        Mast mast = new Mast();
        Fork forkLeft = new Fork();
        Fork forkRight = new Fork();
    }




    private boolean isStarted;
    private double speed;
    private Pallet currentPallet;
    private AIEngine aiEngine;





    @Override
    public void start() {

    }

    @Override
    public void accelerate() {

    }

    @Override
    public void slowDown() {

    }

    @Override
    public void turnLeft(double degree) {

    }

    @Override
    public void turnRight(double degree) {

    }

    @Override
    public void stop() {

    }

    @Override
    public void emergencyStop() {

    }

    @Override
    public void moveForksUp() {

    }

    @Override
    public void moveForksDown() {

    }

    @Override
    public void take(Pallet pallet) {

    }

    @Override
    public void releasePallet() {

    }

}
