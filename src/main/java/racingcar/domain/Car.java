package racingcar.domain;

public class Car {
    private int location;

    public Car(){
        this.location = 0;
    }

    public void moveForward() {
        this.setLocation(this.getLocation() + 1);
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }
}
