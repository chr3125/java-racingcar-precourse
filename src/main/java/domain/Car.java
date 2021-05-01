package domain;

public class Car {
    public Name name;
    public Position position;

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }
}
