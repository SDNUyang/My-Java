package Random_Circle_Point;
import java.util.Scanner;
//������ָ��Բ��������
public class random_circle_point
{

	public static void main(String[] args)
	{
		int x1,y1;
		int x2,y2;
		int x3,y3;
		
		while(true)//ѭ���ҳ����������ĵ������
		{
			 x1=(int)(-100*Math.random()+100*Math.random());//���������
			 y1=(int)(-100*Math.random()+100*Math.random());
			 x2=(int)(-100*Math.random()+100*Math.random());
			 y2=(int)(-100*Math.random()+100*Math.random());
			 x3=(int)(-100*Math.random()+100*Math.random());
			 y3=(int)(-100*Math.random()+100*Math.random());
			if(Math.pow(x1, 2)+Math.pow(y1, 2)==40*40&&Math.pow(x2, 2)+Math.pow(y2, 2)==40*40&&Math.pow(x3, 2)+Math.pow(y3, 2)==40*40)//��������Ҫ���Բ�ϵĵ�
			{
				System.out.println("OK!");
				break;
			}
		}
		
		System.out.println("The first point:("+x1+","+y1+")");
		System.out.println("The first point:("+x2+","+y2+")");
		System.out.println("The first point:("+x3+","+y3+")");
	}

}
