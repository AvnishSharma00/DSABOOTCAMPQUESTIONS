import java.util.ArrayList;
import java.util.Scanner;

public class LinkedListRemoveNthNode {

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] arr=sc.nextLine().split(" ");
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(String a:arr){
            list.add(Integer.parseInt(a));
        }
        System.out.println(list);
        list.remove(list.size()-n);
        System.out.println(list);
        sc.close();
     }
}