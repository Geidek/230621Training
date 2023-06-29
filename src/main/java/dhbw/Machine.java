package dhbw;

public abstract class Machine {

    private boolean isOn = false;
    public boolean GetIsOn(){
        return isOn;
    }

    public void TurnOn()
    {
        isOn = true;
    }

    public void TurnOff()
    {
        isOn = false;
    }

    
}
