public class Merge_two_array {
    public static void main(String[] args) {
        int[] a ={10,20,30};
        int[] b ={40,50,60,70,80};
        int al =a.length;
        int bl =b.length;
        int[] c = new int[al+bl];
        for(int i=0;i<al;i++){
            c[i]=a[i];
        }
        for(int i=0;i<bl;i++){
            c[al+i]=b[i];
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}
