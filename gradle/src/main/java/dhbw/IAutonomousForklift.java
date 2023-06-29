package dhbw;

public interface IAutonomousForklift {


    void start();
    void accelerate();
    void slowDown();
    void turnLeft(double degree);
    //(zulässiger Bereich 5.0 - 30.0)
    void turnRight(double degree);
    //(zulässiger Bereich 5.0 - 30.0)
    void stop();
    //speed = 0
    void emergencyStop();
    //speed = 0
    void moveForksUp();
    void moveForksDown();
    void take(Pallet pallet);
    void releasePallet();


}
