import java.util.Arrays;
import java.util.Scanner;

public class Sortc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] cities = new String[n];
        for (int i = 0; i < n; i++) cities[i] = sc.next();
        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));
    }
}
