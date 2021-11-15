package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final List<Car> carList;

    public Game() {
        this.carList = new ArrayList<>();
    }

    public List<Car> getCarList() {
        return this.carList;
    }
}
