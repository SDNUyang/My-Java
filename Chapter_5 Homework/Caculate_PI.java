package M3_D16;
import java.util.Scanner;
public class Caculate_PI {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number:(尽量大)");
        while(true){
            System.out.println("继续请按1，跳出请按2");
            int x=input.nextInt();
            if(x==1){
                double Pi=0;
                double Molecule=1;
                double Deno=1;
                int n=input.nextInt();
                for(int i=1;i<n;i++){
                    Molecule=Math.pow((-1),i+1);
                    Deno=2*i-1;
                    Pi+=4*(Molecule/Deno);
                }
                System.out.println("Pi:"+Pi);

            }
            if(x==2)
                break;
        }

    }
}
