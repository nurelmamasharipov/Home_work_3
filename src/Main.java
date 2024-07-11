import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double [] numbers = {2.1, 1.9, -4.7 , 8.9, -2.9, 8.3, 7.1, -5.6, 3.7, -11.1, -14.3, 4.2, 9.8, 0.8, 1.2 };
        boolean a = false;
        int num = 0;
        int sum = 0;
        for(double number : numbers){
            if(number < 0) {
                a = true;
            }
            if(a && number > 0) {
                num += 1;
                sum+= number;
            }
        }
        System.out.println(sum /num);
    }
}