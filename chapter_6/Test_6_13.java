package M3D21;

public class Test_6_13 {
    //caculate m(i)
    public static double CaculateM(int num){
        double molecule=1.0;
        double deno=2.0;
        double sum=0.0;
        for(int i=0;i<num;i++){
            double fraction=molecule/deno;
            sum+=fraction;
            molecule++;
            deno++;
        }
        return sum;
    }
    //The main() function
    public static void main(String[] args){
        System.out.println("i          m(i)");
        System.out.println("_______________");
        for (int i=1;i<=20;i+=1){
            System.out.println(i+"          "+CaculateM(i));
        }
    }
}
