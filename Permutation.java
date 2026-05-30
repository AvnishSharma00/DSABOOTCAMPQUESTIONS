import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void permutation(int nums[],boolean used[],List<Integer> current,List<List<Integer>> result ){
                if(current.size()==nums.length){
                    result.add(new ArrayList<>(current));
                    return;
                }
                for(int i=0;i<nums.length;i++){
                    if(used[i]==true){
                        continue;
                    }
                    used[i]=true;
                    current.add(nums[i]);
                    permutation(nums, used, current, result);
                    used[i]=false;
                    current.remove(current.size()-1);
                }
    }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        List<List<Integer>> result=new ArrayList<>();
        permutation(nums, new boolean[nums.length], new ArrayList<>(), result);
        System.out.println(result);

    }
}
