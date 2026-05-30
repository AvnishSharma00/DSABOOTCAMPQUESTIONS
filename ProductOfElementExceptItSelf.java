import java.util.Arrays;

public class ProductOfElementExceptItSelf {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        int prefix[]=new int[arr.length];
        
        prefix[0]=1;
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]*arr[i-1];
        }
       System.out.println(Arrays.toString(prefix));
       int suffix=1;
       for(int i=arr.length-1;i>=0;i--){
           prefix[i]=prefix[i]*suffix;
           suffix*=arr[i];
       }
       System.out.println(Arrays.toString(prefix));
    }
}
