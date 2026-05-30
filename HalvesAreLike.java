public class HalvesAreLike {
      public static boolean isVowel(char ch){
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O'|| ch=='U' || ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
            return true;
        }else
            return false;
    }
    public static void main(String[] args) {
        String s="Book";
        int count=0;
        for(int i=0;i<s.length()/2;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(isVowel(s.charAt(i+s.length()/2))){
                count--;
            }
        }
        System.out.println(count==0);

    }
}
