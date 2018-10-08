public class barkingDog {
    public static void main(String[] args) {

        System.out.println(bark(true,9));
        System.out.println(bark(true,42));
        System.out.println(bark(true,23));


    }

    public static boolean bark(boolean bark,int hour){
        if (((hour>=0)&&((hour<8)) || (hour<=24)&&(hour>22)) && (bark)) {
            return true;
        }

        return false;

    }
}
