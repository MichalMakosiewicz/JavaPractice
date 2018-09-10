public class palidrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-222));

    }

    public static boolean isPalindrome(int number){


        int reverse = 0;
        int checker = number;

        while (number!=0){


            if (number<0){
                int digit = -(number%10);
                reverse-=digit;
                if (number<=-10){
                    reverse*=10;
                }
            }else{
                int digit = number%10;
                reverse+=digit;
                if (number>=10){
                    reverse*=10;
                }
            }

            number/=10;

            System.out.println(reverse);
        }

        if (checker==reverse){
            return true;
        }else {
            return false;
        }

    }
}
