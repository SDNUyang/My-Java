package M3_D16;

public class Disp_leap_year {
    public static void main(String[] args){
        int number=0;//记录这期间范围内闰年的个数
        for(int year=101;year<=2100;year++){
            if(year%4==0&&year%100!=0){
                    System.out.print(year+" ");
                    number++;
            }
            if(year%400==0){
                   System.out.print(year+" ");
                   number++;
            }
            if(number%10==0)
                System.out.print("\n");
        }
        System.out.println();
        System.out.println("闰年个数："+number);

    }
}
