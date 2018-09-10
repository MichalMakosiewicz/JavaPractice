public class interesRate {

    public static void main(String[] args) {
        for (int i=8; i>1; i--){
            System.out.println("10000 at " + i + "% will be " + String.format("%.2f",calcInterest(10000,i)));
        }

        System.out.println("***************************");

        System.out.println(isPrime(9));

        System.out.println("**********************");

        primeNums(23,346);


    }

    public static void primeNums(int from, int to){

        int count = 0;

        for (int i=from; i<to; i++){
            if (isPrime(i)==true){
                System.out.println("Prime: " + i);
                count++;
                if (count>=3){
                    break;
                }
            }
        }

    }


    public static double calcInterest(double ammount, double interestRate){
        return ammount*(interestRate/100);
    }

    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }

        for (int i = 2; i<=n/2; i++){
            if (n%2==0){
                return false;
            }
        }
        return true;
    }
}
