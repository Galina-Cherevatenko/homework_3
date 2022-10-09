package homework_3.task_1;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел, которые будете считывать");
        int n = in.nextInt();
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> same = new ArrayList<>();
        System.out.println("Введите числа");
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    same.add(list.get(i));
                    same.add(list.get(j));}
            }
        }
        list.removeAll(same);
        System.out.println("Одинаковые:");
        for(int i = 0; i< same.size(); i=i+2) {
            System.out.println(same.get(i)+" "+same.get(i++));
        }
        System.out.print("Уникальные: ");
        for(int i = 0; i< list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
}