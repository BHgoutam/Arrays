import java.util.HashSet;
import java.util.Scanner;

public class Find_CommonElement_In_Two_Array {
    public static void main(String[] args) {

        int[] a = {4,3,7,9,2,4};
        int [] b ={5,1,4,8,3,5};

        System.out.println("using loop");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.print(a[i] +" ");
             }
         }

        }
        System.out.println("\n");

// using Hashset and loop :

        System.out.println("Using hashset and loop");
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                  hs.add(a[i]);
                  break;
                }
            }

        }
         for( int no: hs){
             System.out.print(no +" ");
        }
        System.out.println("\n");


         // Using hashset when both array have unique element
        System.out.println("using hashset method");
        HashSet<Integer> hs1 = new HashSet<>();
         for(int no:a){
             hs1.add(no);
         }
         for(int no:b){
             boolean bl =hs1.add(no);

         if(bl==false){
             System.out.print(no +" ");
         }
         }
        System.out.println("\n");

        // Using hashset when both array not have unique element
        System.out.println("using double hashset");
        HashSet<Integer> hs2 = new HashSet<>();
        HashSet<Integer> hs3 = new HashSet<>();

        for(int no:a){
            hs2.add(no);
        }
        for(int no:b){
            hs3.add(no);
        }
        for(int no:hs3){
            boolean bl2  = hs2.add(no);
            if(bl2==false){
                System.out.print(no +" ");
            }
        }

    }
}
