public class numToWord {

    public static void main(String[] args) {

        printNumberToWord(1);
        printNumberToWord(2);
        printNumberToWord(3);
        printNumberToWord(4);
        printNumberToWord(5);
        printNumberToWord(6);
        printNumberToWord(7);
        printNumberToWord(8);
        printNumberToWord(9);
        printNumberToWord(1234);
        printNumberToWord(-3);



    }

    public static void printNumberToWord(int number){

        switch (number){
            case 0:
                System.out.println("ZERO");
                break;

            case 1:
                System.out.println("ONE");
                break;

            case 2:
                System.out.println("TWO");
                break;

            case 3:
                System.out.println("THREE");
                break;

            case 4:
                System.out.println("FOUR");
                break;

            case 5:
                System.out.println("FIVE");
                break;

            case 6:
                System.out.println("SIX");
                break;

            case 7:
                System.out.println("SEVEN");
                break;

            case 8:
                System.out.println("EIGHT");
                break;

            case 9:
                System.out.println("NINE");
                break;

            default:
                System.out.println("OTHER");
        }
    }
}
