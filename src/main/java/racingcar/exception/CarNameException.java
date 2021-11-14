package racingcar.exception;

public class CarNameException extends RuntimeException{
    public CarNameException(String detailMessage){
        super("[ERROR] " + detailMessage);
    }
}
