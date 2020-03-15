package M3_D15;
import java.util.Scanner;
public class The_biggest_common {
    public static void main(String[] args){
        //Creat a Scanner
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter two numbers(int):");
        int a=input.nextInt();
        int b=input.nextInt();
        //compear the two numbers to find the smaller one
        int smaller,bigger;
        if(a>=b){
            smaller=b;
            bigger=a;
        }
        else{
            smaller=a;
            bigger=b;
        }

        System.out.println("The smaller one is :"+smaller);//验证一下
        System.out.println("The bigger one is :"+bigger);
        int i;
        for(i=smaller;i>1;i--){
            if(smaller%i==0&&bigger%i==0){
                System.out.println("The biggest common number is :"+i);
                break;
            }
        }

    }
}
