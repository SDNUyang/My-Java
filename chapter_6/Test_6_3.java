package M3D21;

import java.util.Scanner;

public class Test_6_3{
    //return the reversal of an interger
    public static int reverse(int num){
        int ReverseNum=0;
        int digits=0;
        int value=num;
        while(value%10>0){
            value/=10;
            digits++;
        }
        int[] nums=new int[100];
        int value2=num;
        //第一个循环取出每位上的数字放在一个整形的数组里面
        for(int i=0;i<digits;i++){
            nums[i]=value2%10;
            value2/=10;
        }
        //第二个循环倒序输出并赋值给ReverseNum
        for(int j=0;j<digits;j++){
            ReverseNum+=nums[j]*Math.pow(10,(digits-1-j));
        }
        return ReverseNum;
    }
    //return true if the number is palindrome
    public static boolean isPalindrome(int num){
        if(num==reverse(num))
        return true;
        else return false;
    }
    //the main funcation
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Please enter 1 for continuing and enter 0 for quiting: ");
            int i=input.nextInt();
            if(i==1){
                System.out.println("Please enter a Int-type number :");
                int num=input.nextInt();
                System.out.println("The value of  "+num+" is "+isPalindrome(num));
            }
            if (i==0)
                break;
        }

    }
}
