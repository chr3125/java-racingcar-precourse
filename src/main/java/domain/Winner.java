package domain;

import java.util.ArrayList;
import java.util.List;

public class Winner {
    private final int maxPosition;
    private final List<String> winnerList;


    public Winner(int maxPosition) {
        this.maxPosition = maxPosition;
        this.winnerList = new ArrayList<>();
    }

    public void winnerPositionCompareToAppend(Car car) {
        if(maxPosition == car.position.position){
            winnerList.add(car.name.toString());
        }
    }

    public List<String> getWinnerList() {
        return winnerList;
    }
}
