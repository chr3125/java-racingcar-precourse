package view;

import java.util.Scanner;

public class UserInput {

    private static final Scanner scanner = new Scanner(System.in);

    public static final String CAR_NAMES_INPUT_MESSAGE = "경주할 자동차 이름을 입력하세요.( 이름은 쉼표(,) 기준으로 구분 )";
    public static final String PLAY_FORWARD_CHECK_COUNT_MESSAGE = "시도할 횟수는 몇회인가요?";


    /**
     * 사용자에게 자동차 이름을 받는다.
     */
    public static String carNamesInput(){
        System.out.println(CAR_NAMES_INPUT_MESSAGE);
        return scanner.nextLine();
    }

    /**
     * 사용자에게 몇 회 진행 할 것인지 받는다.
     */
    public static String carForwardInput(){
        System.out.println(PLAY_FORWARD_CHECK_COUNT_MESSAGE);
        return scanner.nextLine();
    }

}
