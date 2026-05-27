import java.util.HashSet;

public class LongestConsecutiveSequence {
       public static void main(String[] args) {
        int arr[]={1,2,11,14,14,3,4};
        HashSet<Integer> ans=new HashSet<>();
        int Longest=0;
        for(int a:arr){
            ans.add(a);
        }
        for(int n:ans){
           if(!ans.contains(n-1)){
             int count=1;
             int curr=n;
             while(ans.contains(curr+1)){
                count++;
                curr++;
             }
             Longest=Math.max(count, Longest);
           }
        }
        System.out.println(Longest);
       }
    
}