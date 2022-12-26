import java.sql.SQLOutput;
import java.util.Scanner;

public class FirstDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];
        for(int i=0 ;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        int temp = 0;
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j] && i!=j){
                    System.out.print("first duplicate element is" + a[i]);
                    temp =temp+1;
                }
            }
            if(temp>0){
                break;
            }
        }

    }
}
