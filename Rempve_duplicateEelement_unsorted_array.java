import java.util.HashSet;

public class Rempve_duplicateEelement_unsorted_array {
    public static void main(String[] args) {
int [] a ={1,2,4,1,5,6,2,8,3,5,4,9,3};
        HashSet<Integer> hs =new HashSet<>();
        for(int i=0;i< a.length;i++){
            hs.add(a[i]);
        }
        for(int no : hs){
            System.out.print(no +" ");
        }
    }
}
