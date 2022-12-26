import java.util.Scanner;

public class Find_Missing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int expected_no_element =a.length+1;
        int total_sum =expected_no_element*(expected_no_element+1)/2;

        int sum=0;
        for (int j : a) {
            sum = sum + j;

        }
        System.out.println("missing number is : "+(total_sum-sum));


        // Using XOR method

        System.out.println("using XOR method");
        int xor1 =a[0];
        for (int j : a) {
            xor1 = xor1 ^ j;
        }
         int xor2 =1;
        for(int i=2;i<a.length+1;i++){
         xor2=xor1^i;
        }
        System.out.println("missing element is : "+ (xor1^xor2));

    }
}
