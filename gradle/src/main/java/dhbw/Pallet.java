package dhbw;

import java.security.DigestException;
import java.util.ArrayDeque;
import java.util.Deque;

public class Pallet {


    private Box[][] storageArea = new Box[3][3];

    private Deque<Box[][]> stack = new ArrayDeque<Box[][]>();


/*
    public boolean AddBoxToPallet(Box box)
    {
        for (int i = 0; i<3; i++)
        {
            for (int j = 0; j<3; j++)
            {
                for (int k = 0; k<3; k++)
                {
                    storageArea[i][j] stack.push(box);

                }


            }
        }

        if (storageArea[i][j]==null)
        {
            storageArea[i][j] = Box;
            return true;
        }
        else return false;


        return false;
    }


*/

    public boolean AddBoxToLayer(Box Box)
    {
        for (int i = 0; i<3; i++)
        {
            for (int j = 0; j<3; j++)
            {
                if (storageArea[i][j]==null)
                {
                    storageArea[i][j] = Box;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean AddBox(Box box)
    {
        if (AddBoxToLayer(box) == false && stack.size()<3)
        {
            stack.add(storageArea);
            storageArea = new Box[3][3];
            AddBoxToLayer(box);
            return true;
        }
        else
        {
            //Stapler packt Palette auf den LKW
            return false;
        }
    }





}
