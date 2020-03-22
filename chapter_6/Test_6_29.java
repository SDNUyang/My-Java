package M3D22;

public class Test_6_29 {
    //这个函数用来判定形式参数是否为素数
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    //主函数
    public static void main(String[] args){
        for(int i=2;i<1000;i++){
            if(isPrime(i)==true){
                if(isPrime(i+2)==true){
                    System.out.println("("+i+","+(i+2)+")");
                }
            }
        }
    }
}
