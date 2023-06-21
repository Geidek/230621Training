package dhbw;

import java.util.LinkedList;
import java.util.Queue;

public class Tank {
    private Queue<String> content = new LinkedList<String>();
    private int length = 20;
    private int width = 25;
    private int height  = 27;

    public Tank() {
        for (int i = 0; i<13500; i++)
        {
            content.add("g");
        }
    }

    public String getOneMl (){
        return content.poll();
    }


    // Getter und Setter für die Tank-Attribute
    /*public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    */

}

