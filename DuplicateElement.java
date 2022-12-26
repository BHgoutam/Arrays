import java.util.*;

public class DuplicateElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = new int[7];
        for(int i=0 ;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        // Brute Force method only for single duplicate value

        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j] && i!=j){
                    System.out.print("duplicate element are:"+ a[j]+",");
                    System.out.println();
                }
            }
        }

        // Using Set :
        System.out.println("----------------");
        System.out.println("Using Set Method");
        System.out.println("Duplicate element are:");
        Set<Integer> st = new HashSet<>();

        for(int no:a){
            boolean b = st.add(no);
            if(b==false){
                System.out.print(no +",");
            }
        }


        // Using HashMap :
        System.out.println("----------------");
        System.out.println("using hashmap");
        Map<Integer,Integer> hm = new HashMap<>();
        for(int no:a){
            Integer count = hm.get(no);
            if(count==null){
                hm.put(no,1);
            }
            else {
                count =count+1;
                hm.put(no,count);
            }
        }
        System.out.println("duplicate element are:");
        Set<Map.Entry<Integer,Integer>> es = hm.entrySet();
        for(Map.Entry<Integer,Integer> me :es){
            if(me.getValue()>1){
                System.out.print(me.getKey());
            }
        }
    }
}
