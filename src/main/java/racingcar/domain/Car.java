package racingcar.domain;

public class Car {
    public static final String STATUS_INFIX_STRING = " : ";
    public static final char LOCATION_EXPRESSION_CHARACTER = '-';
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
        return this.getName() + STATUS_INFIX_STRING + getLocationString();
    }

    private String getLocationString() {
        StringBuilder locationString = new StringBuilder();
        for (int i = 0; i < this.getLocation(); i++) {
            locationString.append(LOCATION_EXPRESSION_CHARACTER);
        }
        return locationString.toString();
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
