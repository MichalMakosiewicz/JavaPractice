public class catPlay {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true,36));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(true,25));
        System.out.println(isCatPlaying(true,24));


    }

    public static boolean isCatPlaying(boolean isSummer, int temperature){

        int maxTemp = 35;
        if (isSummer==true){
            maxTemp = 45;
        }

        if (temperature>=25 && temperature<=maxTemp ){
            return true;
        }else{
            return false;
        }
    }
}
