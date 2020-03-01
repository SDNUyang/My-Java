package Month3_Day1;
import java.util.Scanner;
public class Practic
{
	public static void main(String[] args)
	{
		int number1=(int)(Math.random()*10);
		int number2=(int)(Math.random()*10);
		if(number1<number2)
		{
			number1=number2;
		}
		System.out.print("What is "+number1+"-"+number2+"?"+":   ");//提示用户输入答案
		Scanner input=new Scanner(System.in);
		int answer=input.nextInt();
		if (answer==number1-number2)
		{
			System.out.print("You are correct!");
		}
		else
		{
			System.out.print("You are wrong!");
		}
		
	}

}
