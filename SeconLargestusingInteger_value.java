import java.util.Scanner;

public class SeconLargestusingInteger_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0 ;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int largest = Integer.MIN_VALUE; // Minimum value we USE MAX_VALUE
        int second_largest =Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            if(a[i]>largest){ //FOR MINIMUM "<"
                second_largest =largest;
                largest=a[i];
            }
            else if(a[i]>second_largest && a[i]!= largest){ //FOR MINIMUM "<"
                 second_largest =a[i];
            }
        }
        if(second_largest ==Integer.MIN_VALUE){
            System.out.println("thers is no second largest element in list");
        }else {
            System.out.println("second largest value  " + second_largest);
        }
    }
}
