public class printEqual {

    public static void main(String[] args) {

        printEqual(1,1,1);
        printEqual(1,2,3);
        printEqual(1,1,2);

    }

    public static void printEqual(int one,int two,int tree){
        if (one<0 || two<0 || tree<0){
            System.out.println("Invalid Value");
        }else if (one==two && two==tree){
            System.out.println("All numbers are equal");
        }else if (one!=two && two!=tree && tree!=one){
            System.out.println("All numbers are different");
        }else {
            System.out.println("Neither all are equal or different");
        }
    }
}
