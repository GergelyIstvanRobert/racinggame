package org.fasttrackit;
//inheritance or "is-a" relationship
public class Car extends AutoVehicle {
    public  String color;


    //instance variables

    int doorCount;

    public Car(Engine engine) {
        super(engine);
    }

    @Override
    public void setColor(String color) {
        this.color = color;

    }
//constructor overloading
    public Car() {
        this(new Engine());
    }
}
