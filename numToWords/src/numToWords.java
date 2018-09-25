public class numToWords {

    public static void main(String[] args) {

        numberToWords(101200);


    }

    public static void numberToWords(int number){

        int startNumber = number;

        if (number<0){
            System.out.println("Invalid Value");
        }else{

            String numberName = "";
            int numberLength = 0;

            number=reverse(number);
            int lengthTest = getDigitCount(number);

            while (number>0) {

                String digitName = "";

                int digit = number % 10;
                if (digit == 0) {
                    digitName = "Zero";
                } else if (digit == 1) {
                    digitName = "One";
                } else if (digit == 2) {
                    digitName = "Two";
                } else if (digit == 3) {
                    digitName = "Three";
                } else if (digit == 4) {
                    digitName = "Four";
                } else if (digit == 5) {
                    digitName = "Five";
                } else if (digit == 6) {
                    digitName = "Six";
                } else if (digit == 7) {
                    digitName = "Seven";
                } else if (digit == 8) {
                    digitName = "Eight";
                } else if (digit == 9) {
                    digitName = "Nine";
                } else {
                    System.out.println("ERROR");
                }

                numberName+=digitName;
                numberLength++;

                if (numberLength!=lengthTest){
                    numberName+=" ";
                }

                number/=10;
            }

            if (numberLength!=getDigitCount(startNumber)){

                int dif = getDigitCount(startNumber)-numberLength;
                while(dif>0){
                    numberName = numberName + " Zero";
                    dif--;
                }
            }

            System.out.println(numberName);

        }

    }

    public static int getDigitCount(int number){

        if (number<0){
            return -1;
        }

        int count = 0;

        if (number==0){
            count=1;
        }

        while (number>0){
            count++;
            number/=10;
        }

        return count;
    }

    public static int reverse(int number){

        int reverse = 0;

        while(number!=0){

            int digit = number%10;
            reverse = reverse*10 + digit;
            number/=10;


        }

        return reverse;
    }

}
