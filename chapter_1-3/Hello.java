package hello;
import java.util.Scanner;
public class Hello
{
	public static void main(String[] args)
	{
		int number=(int)((Math.random())*1000-1);//����һ�����100-999���������Ϊ��λ
		System.out.print("���������Ĳ�Ʊ��(��λ����)�� ");
		Scanner input=new Scanner(System.in);
		int YoursNumber=input.nextInt();
		//�������λ
		int number1=number/100;//������İ�λ
		int number2=(number/10)%10;//�������ʮλ
		int number3=number%10;//������ĸ�λ
		//�²����ķ�λ
		int Guess1=YoursNumber/100;//Guess�İ�λ
		int Guess2=(YoursNumber/10)%10;//Guess����ʮλ
		int Guess3=YoursNumber%10;//Guess�ĸ�λ
		//���������
		System.out.println("��Ʊ�ţ�"+number);
		
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
			System.out.print("���ź���û���н���");
		}
	}
}