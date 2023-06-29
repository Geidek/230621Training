package dhbw;

public class Box {
    private Bottle[][] storageArea = new Bottle[3][3];


    public boolean AddBottle(Bottle bottle)
    {
        for (int i = 0; i<3; i++)
        {
            for (int j = 0; j<3; j++)
            {
                if (storageArea[i][j]==null)
                {
                    storageArea[i][j] = bottle;
                    return true;
                }
            }
        }
        return false;
    }
}

