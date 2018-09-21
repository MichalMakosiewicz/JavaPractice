public class listChecker {

    public static void main(String[] args) {

    }

    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree){

        if(numOne<10 || numOne>1000 || numTwo<10 || numTwo>1000 || numThree<10 || numThree>1000){
            return false;
        }

        int one = numOne%10;
        int two = numTwo%10;
        int three = numThree%10;

        if (one==two || two==three || one==three){
            return true;
        }else {
            return false;
        }
    }
}
