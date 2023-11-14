package org.fasttrackit.curs8.code.model;

import org.fasttrackit.curs8.code.Bike;

public class MountainBike extends Bike {
    private String suspension;

    public MountainBike(Integer numberOfWheels, String color, String name, String suspension) {
        super(numberOfWheels, color, name);
        this.suspension = suspension;
        System.out.println("Created MontainBike");
    }

    public String getSuspension() {
        return suspension;
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Mountain Bike moved");
    }

    public void showSomething() {
        System.out.println("Do something");
    }

    public void showSomething(String something) {
        System.out.println(something);
    }

    public void showSomething(String something, String extraSomething) {
        System.out.println(something + " extra " + extraSomething);
    }
}
