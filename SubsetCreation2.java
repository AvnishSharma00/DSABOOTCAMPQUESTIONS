import java.util.ArrayList;
import java.util.List;

public class SubsetCreation2 {
    public static void generateSubset(int index,int arr[],List<Integer> current,List<List<Integer>> result){
        if(index==arr.length){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(arr[index]);
        generateSubset(index+1, arr, current, result);
        current.remove(current.size()-1);
        generateSubset(index+1, arr, current, result);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> reList=new ArrayList<>();
        generateSubset(0, arr, new ArrayList<>(), reList);
        System.out.println(reList);
    }
}
