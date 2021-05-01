package util;

import java.util.Random;

public class MovingCheck {

    public static final int MIN_NUM = 0;
    public static final int MAX_NUM = 9;
    public static final int FORWARD_TRUE_NUM = 4;

    /**
     * random 값이 4이상일 경우 전진 , 3이하일 경우 멈춤
     * @return
     */
    public static boolean carMovingBoolean(){
        int randomNumberForward = generateRandomNumber();
        if(randomNumberForward >= FORWARD_TRUE_NUM){
            return true;
        }
        return false;
    }


    /**
     * random 값 출력
     * @return
     */
    private static int generateRandomNumber() {
        return new Random().nextInt((MAX_NUM - MIN_NUM) + 1) + MIN_NUM;
    }
}
