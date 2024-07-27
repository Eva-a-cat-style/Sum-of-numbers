package Main;

public class app {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] sum = new int[numbers.length];
        int Sum1 = 0;

        for (int i = 0;
             i < numbers.length;  i++) { Sum1 += numbers[i];

            sum[i] = Sum1;}

        for (int i = 0; i < numbers.length; i++)

        {System.out.println("Num is " + numbers[i] +
                ", sum is " + sum[i]); }

        System.out.println("Sum of numbers is " + Sum1); }
    }



