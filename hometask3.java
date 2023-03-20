// В калькулятор добавьте возможность отменить последнюю операцию.
// Дополнительно каскадная отмена - отмена нескольких операций.

package java_projects.java_seminar_4;

import java.util.Scanner;
import java.util.Stack;

public class hometask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Float> st = new Stack<Float>();
        System.out.print("Введите первое число: ");
        float n1 = scanner.nextFloat();
        System.out.print("Введите знак + - / * : ");
        String s = scanner.next();
        System.out.print("Введите второе число: ");
        float n2 = scanner.nextFloat();
        float res = 0;
        switch (s) {
            case "+":
                res = n1 + n2;
                break;
            case "-":
                res = n1 - n2;
                break;
            case "/":
                res = n1 / n2;
                break;
            case "*":
                res = n1 * n2;
                break;
        }
        System.out.println("Результат операции = " + res);
        st.push(res);
        System.out.println(st);
        float n3;
        while (!s.contains("stop")) {
            System.out.print("Введите знак + - / * , 'cancel' или 'stop': ");
            s = scanner.next();
            if (s.contains("cancel")) {
                st.pop();
                res = st.peek();
            } else if (s.contains("stop")) {
                break;
            } else {
                System.out.print("Введите число: ");
                n3 = scanner.nextFloat();
                switch (s) {
                    case "+":
                        res = res + n3;
                        st.push(res);
                        break;
                    case "-":
                        res = res - n3;
                        st.push(res);
                        break;
                    case "/":
                        res = res / n3;
                        st.push(res);
                        break;
                    case "*":
                        res = res * n3;
                        st.push(res);
                        break;
                }
            }
            System.out.println("Результат операции = " + res);
            System.out.println(st);
        }
        scanner.close();
    }
}