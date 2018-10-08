import java.util.Scanner;

public class minAndMAx {

    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter Number:");

        boolean isAnInt = scanner.hasNextInt();

        int min = scanner.nextInt();
        int max = min;


        if (isAnInt){
            while (true){
                System.out.println("Enter Number:");

                isAnInt = scanner.hasNextInt();

                if (isAnInt){

                    int number = scanner.nextInt();

                    if (number < min){
                        min = number;
                    }
                    if (number>max){
                        max= number;
                    }

                }else{
                    break;
                }

                scanner.nextLine();
            }
        }

        System.out.println("Your min: "+ min +". Your max: "+max);
        scanner.close();
    }
}
