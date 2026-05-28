import java.util.HashMap;

public class HashingFreq {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,2,2,3,1,2};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            if(map.containsKey(a)){
               map.put(a, map.get(a).intValue()+1);
            }else{
                map.put(a, 1);
            }
        }
        System.out.println(map);
        
    }
}
