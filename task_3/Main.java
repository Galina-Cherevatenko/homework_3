package homework_3.task_3;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите начало последовательности:");
        int start = in.nextInt();
        System.out.println("Введите конец последовательности:");
        int end = in.nextInt();
        System.out.println("Введите число, для сверки кратности:");
        int krat = in.nextInt();
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        for(int i = 0; i< list.size(); i++) {
            if (list.get(i) % krat == 0)
            System.out.print(list.get(i)+" ");
        }
    }
}