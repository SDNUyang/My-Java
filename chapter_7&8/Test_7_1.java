import org.jetbrains.annotations.NotNull;
import java.util.Scanner;
import java.util.*;
public class Test_7_1 {
    public static void main(String[] args){
      Scanner input=new Scanner(System.in);
       System.out.print("Enter the number of list elements:");
       int numbers=input.nextInt();
       System.out.println();
       int[] list=new int[numbers];
       System.out.print("Enter List:");
       for (int j=0;j<numbers;j++){
           list[j]=input.nextInt();
       }
        int[] array=new int[list.length];
        //Arrays.sort(list);
        for (int i=0;i<list.length;i++){
            array[i]=list[i];
        }
        Arrays.sort(array);
        if(Arrays.equals(list,array)==true){
            System.out.println("The list is already sorted!");
        }
        else if(Arrays.equals(list,array)==false)
            System.out.println("The list is not sorted!");

    }
    /*
    public static boolean isSorted(int[] list){
        int[] array=new int[list.length];
        Arrays.sort(list);
        for (int i=0;i<list.length;i++){
            array[i]=list[i];
        }
        if(Arrays.equals(list,array))
            return true;
        else return false;
    }

     */
}
