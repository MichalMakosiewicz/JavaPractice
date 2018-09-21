public class AddEven {
    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(234567));

    }

    public static int getEvenDigitSum(int number){

        int numSum = 0;

        if (number<0){
            return -1;
        }

        while(number>0){

            if (number%2==0){
                numSum+=number%10;
            }
            number=number/10;
        }

        return numSum;
    }
}
