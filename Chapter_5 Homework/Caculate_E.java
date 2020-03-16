package M3_D16;

import java.util.Scanner;

public class Caculate_E {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number:(尽量大)");
        while(true){
            System.out.println("继续请按1，跳出请按2");
            int x=input.nextInt();
            if(x==1){
                double e=0;
                double Molecule=1;
                double Deno=1;
                int n=input.nextInt();
                for(int i=1;i<n;i++){
                    Molecule=1;
                    Deno*=i;
                    e+=Molecule/Deno;
                }
                System.out.println("e:"+e);

            }
            if(x==2)
                break;
        }

    }
}
