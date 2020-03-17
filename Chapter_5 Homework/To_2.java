package M3_D17;
import java.util.Scanner;
public class To_2 {
    public static void main(String[] args){
        System.out.print("Please enter a decimal number:");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int[] yushu=new int[100];
        int next=num;
        int i=0;
        while(next>=1){
            if(next%2==0){
                yushu[i]=0;
                i++;
            }
            else{
                yushu[i]=1;
                i++;
            }
            next=next/2;
        }
        System.out.print("The corresponding binary number is ");
        for(int j=0;j<i;j++){
            System.out.print(+yushu[i-j-1]);
        }
    }
}
