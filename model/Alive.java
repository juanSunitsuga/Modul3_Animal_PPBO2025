package model;

public enum Alive {
    DEAD(0), ALIVE(1);

    private int value;
    
    Alive(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
