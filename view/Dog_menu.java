package view;

import model.Dog;

import java.util.HashMap;
import java.util.Scanner;

public class Dog_menu {
    public static Scanner sc = new Scanner(System.in);
    public static void dog_menu(HashMap<String, Dog> dogs){
        System.out.println("Search Dog name: ");
        Dog dog = dogs.get(sc.nextLine());
        System.out.println(dog.printData());
    }
}
