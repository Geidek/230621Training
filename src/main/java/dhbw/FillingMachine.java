package dhbw;

public class FillingMachine extends Machine
{
    private Tank tank;
    private Track track;
    private Bottle bottle;

    public FillingMachine(Tank tank, Track track)
    {
        this.tank = tank;
        this.track = track; 
    }
    


    public void fillBottle() {
        if (GetIsOn()!= true)
        {
            TurnOn();
        }
        bottle = track.GetBottle();
        if(bottle != null)
        {
            for (int i = 0; i < 500; i++)
            {
                bottle.fillBottle();
            }
            bottle.setFilled(true);




        }
    }
}
