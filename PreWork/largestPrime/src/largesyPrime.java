public class largesyPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));


    }

    public static int getLargestPrime (int number) {
        if (number < 2) {
            return -1;
        }

        int largestPrime = number;

        while (largestPrime > 0) {

            int divCount = 0;

            for (int i=1; i<=largestPrime; i++){
                if (largestPrime%i==0){
                    divCount++;
                }
            }


            if (divCount==2 && number % largestPrime == 0) {
                return largestPrime;
            }
            largestPrime --;
        }

        return -1;
    }

    private static boolean isPrime(int number){

        int divisor = 1;
        int divisorCount = 0;

        while (divisor <= number) {
            if (number % divisor != 0) {
                divisorCount++;
            }

            divisor ++;
        }

        if (divisorCount != (number - 2)) {
            return false;
        }

        return true;
        }
    }

