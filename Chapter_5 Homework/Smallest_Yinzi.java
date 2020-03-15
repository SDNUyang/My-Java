package M3_D15;
import java.util.Scanner;

public class Smallest_Yinzi {
    public static void main(String[] args){
        //Creat  a Scanner
        Scanner input=new Scanner(System.in);
        System.out.println("Please input a number(int):");
        int num=input.nextInt();
        int i=2;
        int smallest;
        int bigger=num;
        for(;i<=bigger;i++){
            if(num%i==0){
                smallest=i;
                System.out.print(smallest+"  ");
            }
            bigger/=i;
        }
    }
}
