package dhbw;


import java.util.LinkedList;
import java.util.Queue;

public class Track {
    private Queue<Bottle> bottleQueue = new LinkedList<Bottle>();
    private Queue<Box> boxQueue = new LinkedList<Box>();

    private int SerialNumber = 1;

    public Track(){
        addBottleToQueue();
        addBoxToQueue();
    }


    public void addBottleToQueue(){
        for (int i = 0; i < 28; i++){
            bottleQueue.add(new Bottle(SerialNumber));
            SerialNumber++;
        }
    }

    public void addBoxToQueue(){
        for (int i = 0; i < 4; i++){
            boxQueue.add(new Box());
        }
    }

    public Bottle GetBottle() {
    return bottleQueue.poll();
    }

    public Box GetBox()
    {
        return boxQueue.poll();
    }



}


