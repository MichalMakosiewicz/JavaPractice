public class sharedDigits {

    public static void main(String[] args) {

    }

    public static boolean hasSharedDigits(int numOne, int numTwo){

        if (numOne<10 || numOne>99){
            return false;
        }
        if (numTwo<10 || numTwo>99){
            return false;
        }

        int numOnefirst = numOne%10;
        int numOneSec = numOne/10;
        int numTwofirst = numTwo%10;
        int numTwoSec = numTwo/10;

        if (numOnefirst==numTwofirst || numOnefirst==numTwoSec || numOneSec==numTwofirst || numOneSec==numTwoSec){
            return true;
        }else {
            return false;
        }

    }
}
