package LAB_06_NestedLoop;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();

        while (!input.equals("End")){
            String destination=input;
            double minBudget=Double.parseDouble(scanner.nextLine());

            double sum=0;
            while (sum < minBudget){
                double amount=Double.parseDouble(scanner.nextLine());
                sum+=amount;
            }
            System.out.printf("Going to %s!%n",destination);
            input=scanner.nextLine();

        }
    }
}
