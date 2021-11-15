package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Game;
import utils.RandomUtils;

import java.util.List;
import java.util.stream.Collectors;

public class GameController {
    public static final int RANDOM_FROM_INCLUSIVE_NUMBER = 0;
    public static final int RANDOM_TO_INCLUSIVE_NUMBER = 9;
    public static final String NEW_LINE_CHARACTER = "\n";
    private Game game;
    private int iterateNumber;

    public GameController() {
        this.setGame(new Game());
    }

    public void addCars(int carsCount) {
        for (int car = 0; car < carsCount; car++) {
            this.getGame().getCarList().add(new Car());
        }
    }

    public void addCars(List<String> carNameList) {
        carNameList.forEach(carName -> this.getGame().getCarList().add(new Car(carName)));
    }

    public void moveCarsByRandomNumber(int fromInclusive, int toInclusive) {
        this.getGame().getCarList().forEach(car -> {
            int randomizedNumber = RandomUtils.nextInt(fromInclusive, toInclusive);
            car.moveByNumber(randomizedNumber);
        });
    }

    public String runGame() {
        StringBuilder resultString = new StringBuilder();
        while (getIterateNumber() > 0) {
            moveCarsByRandomNumber(RANDOM_FROM_INCLUSIVE_NUMBER, RANDOM_TO_INCLUSIVE_NUMBER);
            resultString.append(this);
            decreaseIterateNumber();
        }
        return resultString.toString();
    }

    private void decreaseIterateNumber() {
        this.setIterateNumber(getIterateNumber() - 1);
    }

    public List<Car> getWinnerCarList() {
        int farthestLocation = getFarthestLocation();
        return getGame().getCarList()
            .stream()
            .filter(car -> car.getLocation() >= farthestLocation)
            .collect(Collectors.toList());
    }

    private int getFarthestLocation() {
        int farthestLocation = 0;
        for (Car car : getGame().getCarList()) {
            farthestLocation = Math.max(farthestLocation, car.getLocation());
        }
        return farthestLocation;
    }

    @Override
    public String toString() {
        StringBuilder carStatusString = new StringBuilder();
        for (Car car : getGame().getCarList()) {
            carStatusString.append(car).append(NEW_LINE_CHARACTER);
        }
        carStatusString.append(NEW_LINE_CHARACTER);
        return carStatusString.toString();
    }

    public Game getGame() {
        return game;
    }

    private void setGame(Game game) {
        this.game = game;
    }

    public void setIterateNumber(int iterateNumber) {
        this.iterateNumber = iterateNumber;
    }

    public int getIterateNumber() {
        return iterateNumber;
    }
}
