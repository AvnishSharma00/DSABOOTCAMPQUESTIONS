import java.util.Arrays;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int last[]=new int[256];
        Arrays.fill(last,-1);
        int left=0;
        int maxlen=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(last[c]>=left){
                left=last[c]+1;
            }
            last[c]=right;
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}