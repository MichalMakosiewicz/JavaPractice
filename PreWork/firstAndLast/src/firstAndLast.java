public class firstAndLast {
    public static void main(String[] args) {

        sumFirstAndLastDigit(123345);
        sumFirstAndLastDigit(-435);


    }

    public static int sumFirstAndLastDigit(int number){

        int lastGigit = number%10;
        int divadeCoutn = 0;

        if (number<0){
            return -1;
        }


        while (number>=10){
            number/=10;
            divadeCoutn+=1;
        }

        int firstDigit = number;
        int sum = lastGigit+firstDigit;

        return sum;
    }
}
