package TwoCircle;
import java.util.Scanner;
public class Two_Circle
{
	public static void main(String[] args)
	{
		System.out.println("�������һ��Բ���������꣺");
		Scanner input=new Scanner(System.in);
		int x1=input.nextInt();
		int y1=input.nextInt();
		System.out.println("�������һ��Բ�İ뾶��");
		int r1=input.nextInt();
		System.out.println("������ڶ���Բ���������꣺");
		int x2=input.nextInt();
		int y2=input.nextInt();
		System.out.println("������ڶ���Բ�İ뾶��");
		int r2=input.nextInt();
		double Road=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		if(Road<=r1-r2||Road<=r2-r1)
		{
			System.out.print("Ƕ��Բ��");
		}
		else if(Road<=r1+r2)
		{
			System.out.print("�ص�Բ��");
		}
		else
		{
			System.out.print("No Such Stations��");
		}
	}

}
