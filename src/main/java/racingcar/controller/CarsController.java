package racingcar.controller;

import racingcar.domain.Car;
import utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsController {
    private final List<Car> carList;

    public CarsController() {
        this.carList = new ArrayList<>();
    }

    public void addCars(int carsCount) {
        for (int car = 0; car < carsCount; car++) {
            this.getCarList().add(new Car());
        }
    }

    public void addCars(List<String> carNameList) {
        carNameList.forEach(carName -> {
            this.getCarList().add(new Car(carName));
        });
    }

    public void moveCarsByRandomNumber(int fromInclusive, int toInclusive) {
        carList.forEach(car -> {
            int randomizedNumber = RandomUtils.nextInt(fromInclusive, toInclusive);
            car.moveByNumber(randomizedNumber);
        });
    }

    public List<Car> getCarList() {
        return this.carList;
    }
}
