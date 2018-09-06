public class feetInches {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeter(23.3,3.4));
        System.out.println(calcFeetAndInchesToCentimeter(12654));

    }

    public static double calcFeetAndInchesToCentimeter(double feet, double inches){
        if (feet>=0 && inches>=0 && inches<=12){

            double centymeters = (feet*12*2.54)+(inches*2.54);

            return centymeters;

        }else{
            return -1;
        }

    }
    public static double calcFeetAndInchesToCentimeter(double inches){
        if (inches>=0){

            double feets = (inches/12);
            double restFeet = (inches%12);

            return calcFeetAndInchesToCentimeter(feets,restFeet);

        }else{
            return -1;
        }

    }


}
