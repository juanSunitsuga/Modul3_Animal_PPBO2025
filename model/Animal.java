package model;

abstract class Animal implements Behavior {
    private String name;
    private Integer age;
    private String food;
    private Gender gender;
    private Alive alive;

    public Animal(String name, int age, String food, Gender gender, Alive alive) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFood() {
        return food;
    }

    public Gender getGender() {
        return gender;
    }

    public Alive getAlive() {
        return alive;
    }

    public boolean isAlive() {
        return alive == Alive.ALIVE;
    }

    public abstract String printSound();

    public abstract String move();

    public String printData() {
        return "=====Parent=====\n" +
                "Type\t\t\t\t: " + this.getClass().getSimpleName() + "\n" +
                "Name\t\t(" + name.getClass().getSimpleName() + ")\t: " + name + "\n" +
                "Age\t\t(" + age.getClass().getSimpleName() + ")\t: " + age + "\n" +
                "Food\t\t(" + name.getClass().getSimpleName() + ")\t: " + food + "\n" +
                "Sound\t\t(" + printSound().getClass().getSimpleName() + ")\t: " + printSound() + "\n" +
                "Alive\t\t\t\t: " + isAlive() + "\n";
    }
}
