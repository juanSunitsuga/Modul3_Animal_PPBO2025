package view;

import model.Duck;

import java.util.HashMap;
import java.util.Scanner;

public class Duck_menu {
    public static Scanner sc = new Scanner(System.in);
    public static void duck_menu(HashMap<String, Duck> ducks){
        System.out.println("Search Duck name: ");
        Duck duck = ducks.get(sc.nextLine());
        System.out.println(duck.printData());
    }
}
