// arrays:
import java.util.*;
public class serious19 {
    public static void main(String[] args) {
        int array []= new int[10];
        for(int i=0;i<10;i++){
            array[i]=-4*i;

        }
        display(array);
        Arrays.sort(array);
        display(array);
        System.out.println(" ");
        display(array);
        Arrays.fill(array,2,4,-1);
        display(array);
        System.out.println(" ");
        Arrays.binarySearch(array,-16);
        System.out.println("binary search of -16: "+Arrays.binarySearch(array,-16 ));
    }
    static void display(int array[]){
        for(int ele:array){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
   
}
