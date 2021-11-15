package racingcar.domain;

import java.util.stream.IntStream;

public class Car {
    private int location;
    private String name;

    public Car() {
        this("");
    }

    public Car(String carName) {
        this.setLocation(0);
        this.setName(carName);
    }

    public void moveForward() {
        this.setLocation(this.getLocation() + 1);
    }

    public void moveByNumber(int randomizedNumber) {
        if (randomizedNumber >= 4)
            this.moveForward();
    }

    @Override
    public String toString() {
        return this.getName() + " : " + getLocationString();
    }

    private String getLocationString() {
        String locationString = "";
        for (int i = 0; i < this.getLocation(); i++) {
            locationString += '-';
        }
        return locationString;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
