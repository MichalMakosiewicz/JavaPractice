public class perfectNumber {

    public static void main(String[] args) {

        System.out.println(isPerfectNumber(6));

    }

    public static boolean isPerfectNumber(int number){

        if (number<1){
            return false;
        }

        int count = 0;

        for (int i=1; i<=(number/2); i++){

            if (number%i==0){
                count+=i;
            }

        }

        if (count==number){
            return true;
        }else {
            return false;
        }

    }
}
