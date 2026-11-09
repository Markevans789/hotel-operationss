package com.puralsight;

public class Rooms {
    private double price;
    private boolean dirty;
    private int numberofBeds;
    private boolean occupied;

    // Constructor
    public Rooms(double price, boolean dirty, int nuberofBeds, boolean occupied){
        this.price = price;
        this.occupied = occupied;
        this.numberofBeds = numberofBeds;
        this.dirty = dirty;
    }

    //Getters
    public int getNumberofBeds() {
        return numberofBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    //Derived getter
    public boolean isAvailable(){
        return !occupied & !dirty;
    }
}
