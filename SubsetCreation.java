import java.util.ArrayList;
import java.util.List;
public class SubsetCreation {
    public static void GenerateSubSet(int index,int arr[],List<Integer> current,List<List<Integer>> result){
           if(index==arr.length){
              result.add(new ArrayList<>(current));
              return;
           }
           current.add(arr[index]);
           GenerateSubSet(index+1, arr, current, result);
           current.remove(current.size()-1);
           GenerateSubSet(index+1, arr, current, result);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> result=new ArrayList<>();
        GenerateSubSet(0,arr,new ArrayList<>(),result);
        System.out.println(result);
        
    }
}
