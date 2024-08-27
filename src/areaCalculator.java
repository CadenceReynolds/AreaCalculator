public class areaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area(double num1, double num2){
        if(num1 < 0){
            return -1.0;
        } else if(num2 <0){
            return -1.0;
        }
        return num1 * num2;
    }

    public static double area(double num1){
        if(num1 < 0){
            return -1.0;
        }
        return (num1 * num1) * Math.PI;
    }
}
