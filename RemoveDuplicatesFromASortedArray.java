public class RemoveDuplicatesFromASortedArray {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,2,2,4,4,4,5,5,6,7};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                arr[++j]=arr[i];
            }
        }
        for(int i=0;i<=j;i++){
            System.out.println(arr[i]);
        }
      //  System.out.println(j);
    }
}
