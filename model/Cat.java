package model;

public class Cat extends Animal {
    public Cat(String name, int age, String food, Gender gender, Alive alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    public String printSound() {
        return "Meowwwww";
    }

    @Override
    public String move() {
        return "The cat moves";
    }

    public String move(int distance) {
        return "The cat moves " + distance + " meters";
    }
}
