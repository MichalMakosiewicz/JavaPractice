public class diagStar {

    public static void main(String[] args) {

        printSquareStar(20);

    }

    public static void squares(int n){
        for (int i = 0; i<n ; i++){
            for (int j = 0; j<n; j++){
                if (i == 0 || i == n-1) System.out.print("*");
                else if (j==i || j==n-1-i) System.out.print("*");
                else if (j == 0 || j == n-1) System.out.print("*");
                else  System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printSquareStar(int n) {

        if (n<5){
            System.out.println("Invalid Value");
        }else {

            for (int i = 0; i<n; i++){
                for (int j=0; j<n; j++){
                    if (i==0 || i == n-1){
                        System.out.print("*");
                    }else if (j==i || j== n-1-i){
                        System.out.print("*");
                    }else if (j==0 || j == n-1){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}