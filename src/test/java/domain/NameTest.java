package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NameTest {


    @Test
    @DisplayName("입력 공백 테스트")
    public void name_empty_test(){
        Assertions.assertThrows(IllegalArgumentException.class,() -> Name.validationStringEmpty(""));
    }


    @ParameterizedTest
    @DisplayName("입력 길이 5자 이하인지 테스트")
    @ValueSource(strings = {"123456","자동차이름지을꺼야","화성갈끄니깐존버"})
    public void name_length_test(String carName){
        Assertions.assertThrows(IllegalArgumentException.class,() ->  Name.validationNameLength(carName));
    }


}
