package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cars {
    public static final int CAR_DEFAULT_POSITION = 0;
    public static final String CAR_DUPLICATE_EXCEPTION_MESSAGE = "자동차의 이름은 중복될 수 없습니다.";
    public static final String EMPTY_CAR_NAME_EXCEPTION_MESSAGE = "공백은 입력할 수 없습니다. 다시 입력해주세요.";

    public List<Car> carList;

    public Cars() {}

    public Cars(List<Car> carList) {
        validationDuplicateCarNames(carList);
        this.carList = carList;
    }

    public Cars(String cars){
        validationEmptyCars(cars);
        List<Car> carList = converterStringCarNamesSplit(cars);
        validationDuplicateCarNames(carList);
        this.carList = carList;
    }

    public static void validationEmptyCars(CharSequence cs) {
        if(null == cs || cs.length() == 0){
            throw new IllegalArgumentException(EMPTY_CAR_NAME_EXCEPTION_MESSAGE);
        }
    }

    public static List<Car> converterStringCarNamesSplit(String cars) {
        List<Car> carList = new ArrayList<>();

        String[] splitCarNames = cars.split(",");
        for(String carName : splitCarNames){
            carList.add(new Car(carName, CAR_DEFAULT_POSITION));
        }

        return carList;
    }

    public static void validationDuplicateCarNames(List<Car> carList){
        Set<String> duplicateCars = new HashSet<>();
        for(Car car : carList){
            duplicateCars.add(car.name.toString());
        }

        if(carList.size() != duplicateCars.size()){
            throw new IllegalArgumentException(CAR_DUPLICATE_EXCEPTION_MESSAGE);
        }
    }



}
