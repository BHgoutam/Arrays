import java.util.Scanner;

public class SecondLargestElement_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0 ;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<a.length;i++){ //using bubble sort
         for(int j=i+1;j<a.length;j++){
             if(a[i]<a[j]){ // for second smallest a[i]>a[j]
                 temp =a[i];
                 a[i] =a[j];
                 a[j] =temp;
             }
            }
         if(i==1){ //after  sorting we get our required second largest element at position at i=0 so need to run the loop more to save time
             break;
         }
        }
        System.out.println("Second largest element is " + a[1]);
    }
}
