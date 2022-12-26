import java.util.Scanner;

public class Kth_LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];
        for(int i=0 ;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter Kth element");
        int k =sc.nextInt();
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                 if(a[i]<a[j]){ // for smallest ">"
                      temp =a[i];
                      a[i]=a[j];
                      a[j]=temp;
                 }
            }
            if(i==k-1){
                System.out.println(k + " largest element is " +a[i]);
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }
    }
}
