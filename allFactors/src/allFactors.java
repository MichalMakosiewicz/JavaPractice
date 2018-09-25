public class allFactors {

    public static void main(String[] args) {

        printFactors(10);

    }

    public static void printFactors(int number){

        if (number<1){
            System.out.println("Invalid Value");
        }else{

            int count = 1;

            while (count<=number){

                if (number%count==0){
                    System.out.println(count);
                }
                count+=1;
            }
        }
    }
}
