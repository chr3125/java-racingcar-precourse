package service;

import domain.Car;
import domain.Cars;
import domain.Winner;
import view.UserInput;
import view.UserResult;

import java.util.List;

public class RacingCarService {

    private static Cars cars;

    public static void play(){
        cars = new Cars(UserInput.carNamesInput());
        playRunCars(UserInput.carForwardInput());
        UserResult.startPlayMessage();

        UserResult.playWinnerResult(getWinnerList());
    }


    private static void playRunCars(String playCountString){
        for(int i=0; i< Integer.parseInt(playCountString); i++){
            cars.carsRun();
            UserResult.playResult(cars);
        }
    }

    private static List<String> getWinnerList(){
        Winner winner = new Winner(cars.maxPosition());

        for(Car car : cars.getCarList()){
            winner.winnerPositionCompareToAppend(car);
        }

        return winner.getWinnerList();
    }

}
