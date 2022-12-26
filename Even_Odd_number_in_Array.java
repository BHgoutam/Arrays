import java.util.ArrayList;
import java.util.Scanner;

public class Even_Odd_number_in_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {
                al1.add(a[i]);
            } else {
                al2.add(a[i]);
            }
        }

        int total1 =0;
        System.out.println("even number in list :");
        for (int no : al1) {
            total1=total1+no;
            System.out.println(no);
        }
        System.out.println("\ntotal even number are :" +al1.size());
        System.out.println("sum of all even number are : " +total1);


        int total2 =0;
        System.out.println("odd number in list");
        for (int no : al2) {
           total2 =total2+no;
            System.out.println(no);
        }
        System.out.println("\nodd number in list : " +al2.size());
        System.out.println("sum of odd number is : " +total2);
    }
}