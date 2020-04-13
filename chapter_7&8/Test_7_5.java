import java.util.Scanner;
public class Test_7_5 {
    public static void main(String[] args){
        int counts=0;
        int ju=0;
        int[] arry1=new int[10];
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an number:");

        int read=0;
        for(int i=0;i<10;i++) {
            read = input.nextInt();//读入一个数
            for (int j = 0; j < 10; j++) {//遍历一边数组，如果有这个数，令ju=0
                if (arry1[j]!= read)
                    ju = 1;
                else if (arry1[j]==read){
                    ju = 0;
                    break;
                }
            }
            //System.out.println("*" + ju);
            if (ju == 1) {
                arry1[counts] = read;
                counts++;
            }
        }
        System.out.println(" number of distinct numbers are :"+counts);
        System.out.print("The distinct numbers are :");
        for (int i=0;i<counts;i++){
            System.out.print(arry1[i]+" ");
        }
    }
}

