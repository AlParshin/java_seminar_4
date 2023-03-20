/* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя..*/

package java_projects.java_seminar_4;

import java.util.LinkedList;
import java.util.Scanner;

public class hometask2 {
    public static void main(String[] args) {
        LinkedList<String> arr = new LinkedList<String>();
        System.out.println("Введите элементы списка: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        arr.add(0, text);
        while (!arr.contains("stop")) {
            arr.addLast(scan.next());
        }
        arr.removeLast();
        System.out.println("Итоговый исходный список: ");
        System.out.println(arr);
        System.out.println();
        arr = enqueue(arr);
        arr = enqueue(arr);
        arr = enqueue(arr);
        System.out.println();
        System.out.println("Результат метода enqueue: ");
        System.out.println(arr);
        System.out.println();
        System.out.println("Результат метода dequeue: ");
        arr = dequeue(arr);
        System.out.println(arr);
        arr = dequeue(arr);
        System.out.println(arr);
        arr = dequeue(arr);
        System.out.println(arr);
        System.out.println();
        System.out.println("Результат метода first: ");
        System.out.println("Первый элемент в очереди = " + first(arr));
        System.out.println();
        scan.close();
    }

    public static LinkedList enqueue(LinkedList<String> list) { // помещает элемент в конец очереди
        System.out.println("Введите еще один элемент в очередь: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        list.addLast(text);
        return list;
    }

    public static LinkedList dequeue(LinkedList<String> list) { // возвращает первый элемент из очереди и удаляет его
        System.out.println("Первый элемент из очереди (который будет сейчас удален) = " + list.getFirst());
        list.pollFirst();
        return list;
    }

    public static String first(LinkedList<String> list) { // возвращает первый элемент из очереди, не удаляя
        String element = list.peekFirst();
        return element;
    }
}