import java.util.ArrayList;

public class SUB_ARRAY_SUM {
    public static void main(String[] args) {

        int [] arr ={1,2,3,7,5,6};
     int size = arr.length;

        ArrayList<Integer> al =new ArrayList<>();
            for(int i=0;i<size-1;i++){

                for(int j=1;i<size-1;j++){
                    
                    if(arr[j]>arr[i]){
                        al.add(arr[j]);

                    }
                    else{
                      al.add(arr[i]);

                    }


                }

        }
        System.out.println(al);
    }
}
