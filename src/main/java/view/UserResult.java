package view;

import domain.Car;
import domain.Cars;

import java.util.List;

public class UserResult {

    public static final String WINNER_RESULT_MESSAGE = "가 최종우승 했습니다.";
    public static final String PLAY_RESULT_MESSAGE = "실행 결과";

    public static void playResult(Cars cars) {
        for(Car car : cars.getCarList()){
            System.out.println(car.name.toString() + ":" + car.position.toString());
        }
        System.out.println(" ");
    }

    public static void startPlayMessage(){
        System.out.println(PLAY_RESULT_MESSAGE);
    }

    public static void playWinnerResult(List<String> cars) {
        System.out.println(String.join(",",cars) + WINNER_RESULT_MESSAGE);
    }
}
