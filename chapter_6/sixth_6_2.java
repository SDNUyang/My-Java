package M3D21;
import java.util.Scanner;
public class sixth_6_2 {
    public static int sumDigits(long n){
        int sum=0;
        long digits=n;
        while(digits%10>0){
            int num=(int)digits%10;
            digits/=10;
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number:");
        long num=input.nextLong();
        System.out.println("The value of the sumDigits is:"+sumDigits(num));

    }
}
