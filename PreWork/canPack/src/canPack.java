public class canPack {

    public static void main(String[] args) {

        System.out.println(canPack(2,1,5));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal){

        int sum = 0;

        while (bigCount>0 && sum/5!=goal/5){

            sum+=5;
            bigCount--;

        }


        while (smallCount>0 && sum!=goal){

            sum++;
            smallCount--;

        }

        if (sum==goal){
            return true;
        }else {
            return false;
        }
    }

}
