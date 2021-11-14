package racingcar.controller;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsController {
    private final List<Car> carList;

    public CarsController(){
        this.carList = new ArrayList<>();
    }

    public void addCars(int carsCount) {
        for(int car=0;car<carsCount;car++) {
            this.getCarList().add(new Car());
        }
    }

    public List<Car> getCarList() {
        return this.carList;
    }
}
