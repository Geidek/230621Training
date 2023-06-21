package dhbw;


import java.io.*;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 0;
        ArrayList<String> store = new ArrayList<String>();
        ArrayList<String> orderedGin = new ArrayList<String>();
        File file = new File("src/main/resources/orders.csv");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.csv"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");

                store.add(values[0]);
                orderedGin.add(values[1]);
            }

        } catch (Exception e)
        {
            //Do Logging Here
        }


        Pallet pallet = new Pallet();
        Queue<Bottle> bottles = new PriorityQueue<Bottle>();


        
    }
}