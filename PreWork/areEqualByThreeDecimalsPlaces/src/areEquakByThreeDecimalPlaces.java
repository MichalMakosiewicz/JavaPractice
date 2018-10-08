public class areEquakByThreeDecimalPlaces {

    public static void main(String[] args) {

//        System.out.println(areEqualByThreeDecimalPlaces(123.1232,123.1234));
//        System.out.println(areEqualByThreeDecimalPlaces(123.1231234,123.1233847));
//        System.out.println(areEqualByThreeDecimalPlaces(123.123,-123.126));
//        System.out.println(areEqualByThreeDecimalPlaces(123.123233,123.12343435));
        System.out.println(areEqualByThreeDecimalPlaces(3.174,3.175));



    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum){

        double decim = 0.0009;
        double number = Math.abs(firstNum-secondNum);

        System.out.println(number);

        if(number<decim){
            return true;
        }
        return false;
    }

}
