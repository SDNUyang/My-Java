package package_4;

public class SearchNumber {
    public static void main(String[] args){
        int num,i=0;
        for(num=100;num<200;num++){
            if(num%5==0||num%6==0){
                if(num%30==0){
                    continue;
                }
                else if(i%10==0)
                {
                    System.out.print("\n");
                }
                else
                    System.out.print(num+" ");
                i++;
            }
        }
    }
}
