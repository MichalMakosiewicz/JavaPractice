public class threeFiveSum {

    public static void main(String[] args) {

        int numSum = 0;

        for (int i=1; i<=1000; i++){
            if ((i%3==0) && (i%5==0)){
                System.out.println("Number: " + i);
                numSum += i;
            }
        }

        System.out.println("Numbers sum:"+ numSum);

    }
}
