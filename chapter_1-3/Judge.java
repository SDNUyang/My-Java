package ShengXiao;
import java.util.Scanner;
public class Judge
{
	
public static void main(String[] args)
	{
		System.out.println("Please input a year which you want to judge:");
		Scanner input=new Scanner(System.in);
		int Year=input.nextInt();
		switch(Year%12)
		{
		case 0:System.out.print("This year is monkey year!");break;
		case 1:System.out.print("This year is rooster year!");break;
		case 2:System.out.print("This year is dog year!");break;
		case 3:System.out.print("This year is pig year!");break;
		case 4:System.out.print("This year is rat year!");break;
		case 5:System.out.print("This year is ox year!");break;
		case 6:System.out.print("This year is tiger year!");break;
		case 7:System.out.print("This year is rabbit year!");break;
		case 8:System.out.print("This year is dragon year!");break;
		case 9:System.out.print("This year is snake year!");break;
		case 10:System.out.print("This year is horse year!");break;
		case 11:System.out.print("This year is sheep year!");break;
		}
	}
}
