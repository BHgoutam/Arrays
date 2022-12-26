import java.util.HashSet;
import java.util.Scanner;

public class FirstDuplicateUsing_Hashset {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];
        for(int i=0 ;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        HashSet<Integer> hs =new HashSet<>();
        int temp =-1;
        for(int i=a.length-1;i>=0;i--){
            if(hs.contains(a[i])){
                temp = i;
            }else {
                hs.add(a[i]);
            }
        }
        if(temp!=-1){
            System.out.println("first DUPLICATE ELEMNT " +a[temp]);
        }else {
            System.out.println("does not contain duplicate element");
        }

    }
}
