package racingcar.domain;

public class Car {
    private int location;
    private String name;

    public Car() {
        this.location = 0;
    }

    public void moveForward() {
        this.setLocation(this.getLocation() + 1);
    }

    public void moveByNumber(int randomizedNumber) {
        if (randomizedNumber >= 4)
            this.moveForward();
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
