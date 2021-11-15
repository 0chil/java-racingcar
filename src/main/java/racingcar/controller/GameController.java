package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Game;
import utils.RandomUtils;

import java.util.List;

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

    public void runGame() {
        while(getIterateNumber() > 0){
            moveCarsByRandomNumber(0,9);
            decreaseIterateNumber();
        }
    }

    private void decreaseIterateNumber() {
        this.setIterateNumber(getIterateNumber() - 1);
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
