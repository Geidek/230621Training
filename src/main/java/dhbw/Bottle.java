package dhbw;

import java.util.LinkedList;
import java.util.UUID;

import javax.print.DocFlavor.STRING;

enum MPiece{
    CARNETTE
}

public class Bottle {
    private name name;
    private int content;
    private MPiece mouthPiece;
    private double height;
    private double diameter;
    private int marginalCapacity;
    private int weight;
    private boolean isFilled;
    private int serialNumber;


    public Bottle(int SerialNumber) {
        this.name = dhbw.name.Rangpur;
        this.marginalCapacity = 545;
        this.content = 0;
        this.mouthPiece = MPiece.CARNETTE;
        this.height = 164.5;
        this.diameter = 86;
        this.weight = 400;
        this.isFilled = false;
        this.serialNumber = SerialNumber;
    }

    // Getter und Setter für die Bottle-Attribute
    public name getName() {
        return name;
    }

    public void setName(name name) {
        this.name = name;
    }

    public int getContent() {
        return content;
    }

    public void fillBottle() {

        content = 500;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getMarginalCapacity() {
        return marginalCapacity;
    }

    public void setMarginalCapacity(int marginalCapacity) {
        this.marginalCapacity = marginalCapacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String createText(name name) {
        return "Tanqueray | "+ name;
    }
    public String createText(int serialNumber) {
        return "Drink responsibly\n" + System.currentTimeMillis() + "\nSeq " + serialNumber;
    }

    public Lable front = new Lable(position.FRONT, createText(getName()), getSerialNumber());
    public Lable back = new Lable(position.BACK, createText(getSerialNumber()), getSerialNumber());
}
