public class BinaryMatrixSearch {
    public static void main(String[] args) {
           int matrix[][] = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
             };
             int rows=matrix.length;
             int cols=matrix[0].length;
             int low=0;
             int high=rows*cols-1;
             int target=57;
             boolean found=false;
             while(low<=high){
                int mid=low+(high-low)/2;
                int row=mid/cols;
                int col=mid%cols;
                int value=matrix[row][col];
                if(value==target){
                    found=true;
                    break;
                }else if(value<target){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
                
             }
             System.out.println(found);
    }
}
