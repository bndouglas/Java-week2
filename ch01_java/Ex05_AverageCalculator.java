import java.util.Scanner;
import java.util.ArrayList;

public class Ex05_AverageCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();

        System.out.println("Enter a number: ");
        String response = sc.next();

        while (!response.equals("=")) {
            System.out.print("Enter a number: ");
            Integer nextNum = Integer.parseInt(response);
            numList.add(nextNum+12);
            response = sc.next();
        }
        float total = 0;

        for (Integer num : numList ){
            total += num;
        }
        float average = total / numList.size();

        System.out.println(average);
        sc.close();
    }
}
