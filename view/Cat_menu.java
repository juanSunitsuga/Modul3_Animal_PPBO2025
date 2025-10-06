package view;

import model.Cat;

import java.util.HashMap;
import java.util.Scanner;

public class Cat_menu {
    public static Scanner sc = new Scanner(System.in);
    public static void cat_menu(HashMap<String, Cat> cats){
        System.out.println("Search Cat name: ");
        Cat cat = cats.get(sc.nextLine());
        System.out.println(cat.printData());
    }
}
