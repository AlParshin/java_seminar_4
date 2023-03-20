// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

package java_projects.java_seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class hometask1 {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<String>();
        System.out.println("Введите элементы списка: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        arr.add(0, text);
        while (!arr.contains("stop")) {
            arr.addLast(scan.next());
        }
        scan.close();
        arr.removeLast();
        System.out.println("Итоговый исходный список: ");
        System.out.println(arr);
        System.out.println("Перевернутый список: ");
        System.out.println(perevorot(arr));
    }

    public static LinkedList perevorot(LinkedList<String> old_list) {
        LinkedList<String> new_list = new LinkedList<String>();
        for (int i = 0; i < old_list.size(); i++) {
            new_list.addFirst(old_list.get(i));
        }
        return new_list;
    }
}