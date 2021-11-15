package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Game;
import utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GameController {
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
            moveCarsByRandomNumber(0, 9);
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
            carStatusString.append(car).append("\n");
        }
        carStatusString.append("\n");
        return carStatusString.toString();
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void setIterateNumber(int iterateNumber) {
        this.iterateNumber = iterateNumber;
    }

    public int getIterateNumber() {
        return iterateNumber;
    }
}
