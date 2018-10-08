import java.util.Scanner;

public class readingInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count<=10){
            System.out.println("Enter your "+count+" number: ");
            boolean hasNextInt = scanner.hasNextInt();
            int number = scanner.nextInt();

            if (hasNextInt){

                sum+=number;
                count++;

            }else {
                System.out.println("Something went wrong, try again!");
            }
        }
        scanner.close();
        System.out.println(sum + " - sum of your numbers.");
    }

}
