package view;

import model.*;

import java.util.HashMap;
import java.util.Scanner;

public class Main_menu {
    public static Scanner sc = new Scanner(System.in);
    public static void main_menu(){
        HashMap<String, Cat> cats = new HashMap<>();
        HashMap<String, Dog> dogs = new HashMap<>();
        HashMap<String, Duck> ducks = new HashMap<>();
        HashMap<String, Horse> horses = new HashMap<>();
        cats.put("Whiskers", new Cat("Whiskers", 3, "Fish", Gender.MALE, Alive.ALIVE));
        cats.put("Mittens", new Cat("Mittens", 5, "Chicken", Gender.FEMALE, Alive.ALIVE));
        cats.put("Shadow", new Cat("Shadow", 2, "Tuna", Gender.MALE, Alive.ALIVE));
        cats.put("Luna", new Cat("Luna", 4, "Salmon", Gender.FEMALE, Alive.ALIVE));
        cats.put("Simba", new Cat("Simba", 6, "Beef", Gender.MALE, Alive.ALIVE));

        dogs.put("Buddy", new Dog("Buddy", 4, "Kibble", Gender.MALE, Alive.ALIVE));
        dogs.put("Bella", new Dog("Bella", 3, "Chicken", Gender.FEMALE, Alive.ALIVE));
        dogs.put("Max", new Dog("Max", 6, "Beef", Gender.MALE, Alive.ALIVE));
        dogs.put("Lucy", new Dog("Lucy", 2, "Fish", Gender.FEMALE, Alive.ALIVE));
        dogs.put("Charlie", new Dog("Charlie", 5, "Lamb", Gender.MALE, Alive.ALIVE));

        ducks.put("Daffy", new Duck("Daffy", 2, "Seeds", Gender.MALE, Alive.ALIVE));
        ducks.put("Daisy", new Duck("Daisy", 3, "Worms", Gender.FEMALE, Alive.ALIVE));
        ducks.put("Donald", new Duck("Donald", 1, "Insects", Gender.MALE, Alive.ALIVE));
        ducks.put("Molly", new Duck("Molly", 4, "Plants", Gender.FEMALE, Alive.ALIVE));
        ducks.put("Louie", new Duck("Louie", 3, "Grains", Gender.MALE, Alive.ALIVE));

        horses.put("Spirit", new Horse("Spirit", 5, "Hay", Gender.MALE, Alive.ALIVE));
        horses.put("Bella", new Horse("Bella", 4, "Grains", Gender.FEMALE, Alive.ALIVE));
        horses.put("Max", new Horse("Max", 7, "Grass", Gender.MALE, Alive.ALIVE));
        horses.put("Star", new Horse("Star", 3, "Apples", Gender.FEMALE, Alive.ALIVE));
        horses.put("Charlie", new Horse("Charlie", 6, "Carrots", Gender.MALE, Alive.ALIVE));


        System.out.println("=====Choose Animal=====");
        System.out.println("1. Cat");
        System.out.println("2. Dog");
        System.out.println("3. Duck");
        System.out.println("4. Horse");
        System.out.println("Enter your choice: ");

        // Dog dog = new Dog("Rex", 3, "Meat", Gender.MALE, Alive.ALIVE);
        // System.out.println(dog.printSound());
        // System.out.println(dog.printData());

        switch (sc.nextInt()) {
            case 1:
                Cat_menu.cat_menu(cats);
                break;
            case 2:
                Dog_menu.dog_menu(dogs);
                break;
            case 3:
                Duck_menu.duck_menu(ducks);
                break;
            case 4:
                Horse_menu.horse_menu(horses);
                break;
            default:
                System.out.println("Invalid choice");
                Main_menu.main_menu();
                break;
        }
    }
}
