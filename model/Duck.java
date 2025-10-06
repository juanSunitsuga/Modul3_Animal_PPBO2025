package model;

public class Duck extends Animal {
    public Duck(String name, int age, String food, Gender gender, Alive alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    public String printSound() {
        return "Quack!";
    }

    @Override
    public String move() {
        return "The duck moves";
    }

    public String move(int distance) {
        return "The duck moves " + distance + " meters";
    }
}
