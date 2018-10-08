public class hasEqualSum {

    public static void main(String[] args) {

        System.out.println(hasEqualSum(1,2,3));
        System.out.println(hasEqualSum(1,-12,-11));
        System.out.println(hasEqualSum(-7,-4,-11));
        System.out.println(hasEqualSum(-34,48,14));


    }

    public static boolean hasEqualSum(int num1, int num2, int num3){

        if (num1+num2 == num3){
            return true;
        }

        return false;
    }
}
