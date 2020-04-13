import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Test_7_18 {
    public static void main(String[] args){
        int[] arr = new int[10];
        for(int i = 0;i < arr.length;i++){
            Random ran = new Random();
            arr[i] = ran.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        //冒泡排序
        System.out.println("-----------------冒泡排序开始----------------");
        for(int i = 0;i < arr.length - 1;i++){
            for(int j = 0;j < arr.length - 1 - i;j++){
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("-------------冒泡排序结束---------------");
	System.out.println(Arrays.toString(arr));
    }
}
