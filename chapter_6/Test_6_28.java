package M3D22;

public class Test_6_28 {
    //judge the number is Neson Prime or not
    public static boolean isMesonPrime(int n){
         for(int i=0;i<n;i++){
             if((Math.pow(2,i)-1)==n){
                 for(int j=2;j<n;j++){        //这个循环用来检验是否为素数
                     if(n%j==0)
                         return false;
                 }
                 return true;
             }
         }
        return false;
    }
    //the main function
    public static void main(String[] args){
        System.out.println("p          2^p-1");
        System.out.println("_______________");
        int i=0;
        for(;i<=31;i++){
            boolean Judge=isMesonPrime((int)(Math.pow(2,i)-1));
            if(Judge==true){
                System.out.println(i+"          "+(int)(Math.pow(2,i)-1));
            }
        }
    }
}
