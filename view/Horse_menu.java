package view;

import model.Horse;

import java.util.HashMap;
import java.util.Scanner;

public class Horse_menu {
    public static Scanner sc = new Scanner(System.in);
    public static void horse_menu(HashMap<String, Horse> horses){
        System.out.println("Search Horse name: ");
        Horse horse = horses.get(sc.nextLine());
        System.out.println(horse.printData());
    }
}
