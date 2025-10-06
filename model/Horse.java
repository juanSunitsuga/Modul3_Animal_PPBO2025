package model;

public class Horse extends Animal {
    public Horse(String name, int age, String food, Gender gender, Alive alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    public String printSound() {
        return "Hehe";
    }

    @Override
    public String move() {
        return "The horse moves";
    }

    public String move(int distance) {
        return "The horse moves " + distance + " meters";
    }
}
