public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,3,2,1,1,4,5};
        int candiate=0;
        int count=0;
        for(int a:arr){
            if(count==0){
                candiate=a;
                count++;
            }else if(candiate==a){
                count++;
            }else{
                count--;
            }
        }
        System.out.println(candiate);
    }
}
