public class commonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(36,90));

    }

    public static int getGreatestCommonDivisor(int one, int two){

        if (one<10 || two<10){
            return -1;
        }

        int count = 1;
        int divisor = 0;

        while (count<one){

            if (one%count==0 && two%count==0){

                divisor = count;

            }

            count+=1;
        }

        return divisor;
    }
}
