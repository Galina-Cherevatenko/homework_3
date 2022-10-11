package homework_3.task_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        List<Integer> result = list.stream().filter(x->(x%krat==0)).
                collect(Collectors.toList());
        System.out.print(result);

    }
}