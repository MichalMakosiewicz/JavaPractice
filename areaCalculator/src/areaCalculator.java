public class areaCalculator {

    public static void main(String[] args) {

        System.out.println(area(23.4));
        System.out.println(area(23,54));

    }

    public static double area(double radius){

        if (radius<0){
            return -1.0;
        }

        double pi = 3.14159;
        return pi*radius*radius;

    }

    public static double area(double x,double y){

        if (x<0 || y<0){
            return -1.0;
        }

        return x*y;
    }
}
