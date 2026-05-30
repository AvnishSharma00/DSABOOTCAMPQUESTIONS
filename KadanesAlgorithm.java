public class KadanesAlgorithm {
    public static void main(String[] args) {
        int arr[]={12,34,5,3,-567,6,42,21};
        int maxSum=arr[0];
        int currSum=arr[0];
        for(int i=1;i<arr.length;i++){
            currSum=Math.max(arr[i],currSum+arr[i]);
            maxSum=Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
    }
}
