package racingcar.controller;

import racingcar.domain.Cars;

import java.util.ArrayList;
import java.util.List;

public class CarsController {
    private final List<Cars> carsList;

    public CarsController(){
        this.carsList = new ArrayList<>();
    }

    public void addCars(int carsCount) {
        for(int car=0;car<carsCount;car++) {
            this.getCarsList().add(new Cars());
        }
    }

    public List<Cars> getCarsList() {
        return this.carsList;
    }
}
