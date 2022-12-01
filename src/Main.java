import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            integers.add(random.nextInt(1,100));
        }
        List<Integer> even = even(integers);
        List<Integer> odd = odd(integers);
        System.out.println("Numbers: "+integers);
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);
    }
    public static List<Integer> even(List<Integer> integers){
        List<Integer> even = new ArrayList<>();
        for (Integer integer:integers) {
            if(integer % 2 == 0){
                even.add(integer);
            }
        }
        return even;
    }
    public static List<Integer> odd(List<Integer> integers){
        List<Integer> odd = new ArrayList<>();
        for (Integer integer:integers) {
            if(integer % 2 != 0){
                odd.add(integer);
            }
        }
        return odd;
    }
}