package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    @DisplayName("입력받은 Cars String이 null인지 체크")
    public void validation_empty_cars_test(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> Cars.validationEmptyCars(""));
    }


    @ParameterizedTest
    @DisplayName("String cars를 List<Car> 로 Convert")
    @ValueSource(strings = {"벤츠,아우디,BMW","벤츠","벤츠,아우디"})
    public void converter_string_car_names_split_test(String cars){
        assertThat(cars.split(",").length).isEqualTo(Cars.converterStringCarNamesSplit(cars).size());
    }


    @ParameterizedTest
    @DisplayName("자동차를 입력받을 때 중복된 내역이 없는지 테스트")
    @ValueSource(strings = {"벤츠,벤츠,BMW","벤츠,BMW,BMW","아우디,아우디,아우디"})
    public void validation_duplicate_car_names_test(String cars){
        Assertions.assertThrows(IllegalArgumentException.class,() -> Cars.validationDuplicateCarNames(Cars.converterStringCarNamesSplit(cars)));
    }

}
