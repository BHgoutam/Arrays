import java.util.Scanner;

public class UniqueElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];
        for(int i=0 ;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int res =a[0];
        for(int i=1;i<a.length;i++){
            res =res^a[i];
        }
        System.out.println("unique element is " +res);
    }
}
