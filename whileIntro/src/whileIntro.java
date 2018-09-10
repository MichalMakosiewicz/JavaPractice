public class whileIntro {

    public static void main(String[] args) {

        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while(number<=finishNumber){
            number++;


            if (!isEvenNumber(number)){
                continue;
            }
            if (count>=5){
                break;
            }
            count++;
            System.out.println("Even number: "+ number);

        }

        System.out.println("Total count: " + count);

    }

    public static boolean isEvenNumber(int number){

        if (number%2==0){
            return true;
        }else {
            return false;
        }
    }
}
