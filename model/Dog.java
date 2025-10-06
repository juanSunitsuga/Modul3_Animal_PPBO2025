package model;

public class Dog extends Animal {
    public Dog(String name, int age, String food, Gender gender, Alive alive) {
        super(name, age, food, gender, alive);
    }

    @Override
    public String printSound() {
        return "Woof Woof";
    }

    @Override
    public String move() {
        return "The dog moves";
    }

    public String move(int distance) {
        return "The dog moves " + distance + " meters";
    }
}
