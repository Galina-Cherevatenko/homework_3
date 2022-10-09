package homework_3.task_2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину стороны 1:");
        int a = in.nextInt();
        System.out.println("Введите длину стороны 2:");
        int b = in.nextInt();
        System.out.println("Введите длину стороны 3:");
        int c = in.nextInt();
        if (a<(b+c) && b<(a+c) && c<(a+b))
            System.out.println("Треугольник существует");
        else
            System.out.println("Треугольник не существует");
    }
}