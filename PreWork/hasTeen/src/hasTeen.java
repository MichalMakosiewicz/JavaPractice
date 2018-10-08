public class hasTeen {

    public static void main(String[] args) {

        System.out.println(hasTeen(12,34,45));
        System.out.println(hasTeen(36,2,45));
        System.out.println(hasTeen(122,15,45));

    }

    public static boolean hasTeen(int num1, int num2, int num3){

        if (num1>=13 && num1<=19){
            return true;
        }else if (num2>=13 && num2<=19){
            return true;
        }else if (num3>=13 && num3<=19){
            return true;
        }

        return false;
    }
}
