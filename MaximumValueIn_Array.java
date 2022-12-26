import java.util.Scanner;

public class MaximumValueIn_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
         for(int i=0 ;i<a.length;i++){
             a[i]=sc.nextInt();
        }
         int max =a[0];
         for(int i=1;i<a.length;i++){


             if(a[i]>max){
                 max =a[i];
             }
         }
        System.out.println("maximum value in array is "+ max);
    }
}
