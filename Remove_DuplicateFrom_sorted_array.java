public class Remove_DuplicateFrom_sorted_array {
    public static void main(String[] args) {
//using two array method
        int [] a={1,2,2,3,4,5,5};
        int [] temp =new int[a.length];
        int j=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                temp[j] =a[i];
                j++;
            }
        }
        temp[j]=a[a.length-1];

        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }

        System.out.println("\n");

//using single array method
        int k=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                a[k] =a[i];
                k++;
            }
        }
        a[k]=a[a.length-1];

        for(int i=0;i<k+1;i++){
            System.out.print(a[i]+" ");
        }
    }
}
