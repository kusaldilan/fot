package com.kusaldilan.fot;

public class Sensor {
    public Sensor(String name, double value) {
        this.name = name;
        this.value = value;

    }

    public Sensor(double value) {
        this.value = value;
    }

    public Sensor() {
    }

    public Sensor(String name) {
        this.name = name;


    }

    public String name;
    public double value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
