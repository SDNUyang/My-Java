package TwoCircle;
import java.util.Scanner;
public class Two_Circle
{
	public static void main(String[] args)
	{
		System.out.println("请输入第一个圆的中心坐标：");
		Scanner input=new Scanner(System.in);
		int x1=input.nextInt();
		int y1=input.nextInt();
		System.out.println("请输入第一个圆的半径：");
		int r1=input.nextInt();
		System.out.println("请输入第二个圆的中心坐标：");
		int x2=input.nextInt();
		int y2=input.nextInt();
		System.out.println("请输入第二个圆的半径：");
		int r2=input.nextInt();
		double Road=Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		if(Road<=r1-r2||Road<=r2-r1)
		{
			System.out.print("嵌套圆！");
		}
		else if(Road<=r1+r2)
		{
			System.out.print("重叠圆！");
		}
		else
		{
			System.out.print("No Such Stations！");
		}
	}

}
