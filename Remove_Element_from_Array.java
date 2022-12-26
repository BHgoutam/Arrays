public class Remove_Element_from_Array {
    public static void main(String[] args) {

        int[] a ={10,20,30,40,50,60};
        int del_ele =30;
        int count=0;
        for(int i=0;i<a.length;i++)
        {

            if(a[i]==del_ele){
                for(int j=i;j<a.length-1;j++){
                    a[j]=a[j+1];
                }
                count =count+1;
                break;

            }
        }
        if(count==0){
            System.out.println("element not founf");
        }else {
            System.out.println("element added successfuly");
        }
        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i] +" ");
        }
    }

}
