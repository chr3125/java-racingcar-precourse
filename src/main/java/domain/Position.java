package domain;

public class Position {
    public int position;
    public boolean forwardBoolean;

    public Position(int position) {
        this.position = position;
        this.forwardBoolean = false;
    }


    /**
     * position value에 따라 "-" 을 표기한다.
     * @return positionToHyphen
     */
    @Override
    public String toString() {
        String positionToHyphen = "";

        for(int i=0; i < position; i++){
            positionToHyphen += "-";
        }

        return positionToHyphen;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;

        Position position1 = (Position) o;

        return position == position1.position;

    }


}
