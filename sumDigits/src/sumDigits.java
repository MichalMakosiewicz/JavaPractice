public class sumDigits {

    public static void main(String[] args) {

//        System.out.println(sumDigits(9999));

        System.out.println(sumDugVol(999999999));
    }

    public static int sumDigits(int num){

        if (num<10){
            return -1;
        }

        int dzielnik=1000;
        int eleSum = 0;

        while (num>10){

            System.out.println("dzielnik: "+dzielnik);

            if (dzielnik>num){
                dzielnik=dzielnik/10;
                continue;
            }else{

                System.out.println("number: " + num );

                int element = num/dzielnik;
                System.out.println("element: " + element +  "  sum: " + eleSum);
                num = num%dzielnik;
                System.out.println("Num: " + num);

                eleSum+=element;

            }
        }

        if (num<10 && num>0){
            eleSum+=num;
        }


        return eleSum;
    }

    public static int sumDugVol(int num){

        if (num<10){
            return -1;
        }

        int sum = 0;

        while (num>0){

            int digit = num%10;
            sum+=digit;

            num/=10;
        }

        return sum;
    }

}
