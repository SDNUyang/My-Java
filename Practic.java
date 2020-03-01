package Month3_Day1;
import java.util.Scanner;
public class Practic
{
	public static void main(String[] args)
	{
		int number1=(int)(Math.random()*10);//产生一个随机0-9的随机数作为个位
		int number2=(int)(Math.random()*10);//作为十位
		int number3=(int)(Math.random()*10);//作为百位
		int number=number1*1+number2*10+number3*100; //确定一个顺序
		System.out.print("请输入您的彩票号(三位整数)： ");
		Scanner input=new Scanner(System.in);
		int YoursNumber[] = null;
		for(int i=0;i<3;i++)
		{
			 YoursNumber[i]=(int) input.nextInt();
		}
		if((YoursNumber[0]*100+YoursNumber[1]*10+YoursNumber[2]*1)==number)
		{
			System.out.print("Perfectly! You are rewded 10000 dollars!");
		}
		if((YoursNumber[0]==number1||YoursNumber[0]==number2||YoursNumber[0]==number3)&&(YoursNumber[1]==number1||YoursNumber[1]==number2||YoursNumber[1]==number3)&&(YoursNumber[2]==number1||YoursNumber[2]==number2||YoursNumber[2]==number3))
		{
			System.out.print("Great! You are rewded 3000 dollars!");
		}
		if((YoursNumber[0]==number1||YoursNumber[0]==number2||YoursNumber[0]==number3)||(YoursNumber[1]==number1||YoursNumber[1]==number2||YoursNumber[1]==number3)||(YoursNumber[2]==number1||YoursNumber[2]==number2||YoursNumber[2]==number3))
		{
			System.out.print("Good! You are rewded 1000 dollars!");
		}
		else
		{
			System.out.print("It's so peety you have no rewed!");
		}
	}

}
