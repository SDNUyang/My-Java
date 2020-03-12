package Package_1;
import java.util.Scanner;
public class Test_1 {
    public static  void main(String[] args)
    {
        int number=(int)((Math.random())*1000-1);//产生一个随机100-999的随机数作为个位
        System.out.print("请输入您的彩票号(三位整数)： ");
        Scanner input=new Scanner(System.in);
        int YoursNumber=input.nextInt();
        //随机数分位
        int number1=number/100;//随机数的百位
        int number2=(number/10)%10;//随机数的十位
        int number3=number%10;//随机数的个位
        //猜测数的分位
        int Guess1=YoursNumber/100;//Guess的百位
        int Guess2=(YoursNumber/10)%10;//Guess数的十位
        int Guess3=YoursNumber%10;//Guess的个位
        //分情况讨论
        System.out.println("彩票号："+number);

        if(YoursNumber==number)
        {
            System.out.print("Exact Match:you win $10000");
        }
        else if((Guess1==number1||Guess1==number2||Guess1==number3)&&(Guess2==number1||Guess2==number2||Guess2==number3)&&(Guess3==number1||Guess3==number2||Guess3==number3))
        {
            System.out.print("Exact Match:you win $3000");
        }
        else if((Guess1==number1||Guess1==number2||Guess1==number3)||(Guess2==number1||Guess2==number2||Guess2==number3)||(Guess3==number1||Guess3==number2||Guess3==number3))
        {
            System.out.print("Exact Match:you win $1000");
        }
        else
        {
            System.out.print("很遗憾您没有中奖！");
        }
    }
}
