package util;

import domain.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class MovingCheckTest {


    @ParameterizedTest
    @CsvSource(value = {"벤츠,0","아우디,2","BMW,1","쿠페,2"}, delimiterString = ",")
    @DisplayName("랜덤 값 별 전진/멈춤 여부 테스트")
    public void position_forward_test(String name , int position){
        Car car = new Car(name,position);
        car.position.forwardPosition();

        System.out.println(car.name.toString() + ":" + car.position.toString() + ":" + car.position.forwardBoolean);
        assertThat(car.position.forwardBoolean == true? position + 1 : position).isEqualTo(car.position.position);
    }


}
