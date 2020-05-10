package ch10;
import java.math.BigDecimal;
import java.math.BigInteger;

public class SerchBigPrimeNumber {
    public static void main(String[] args) {
        int num=0;
        String str=Long.MAX_VALUE+"";
        BigInteger n=new BigInteger(str);
        while(num<5){
            if (isPrime(n)){
                System.out.print(n+" ");
                num++;
            }
            n=n.add(BigInteger.ONE);//翻译过来就是n++的意思
        }
    }
    public static boolean isPrime(BigInteger i) {
        for( BigInteger divisor1=new BigInteger("2");divisor1.compareTo(i.divide(new BigInteger("2")))<=0;divisor1=divisor1.add(BigInteger.ONE)) {
            if(i.remainder(divisor1).compareTo(BigInteger.ZERO)==0)
                //判断是否为素数
                return false;
        }
        return true;
    }
}
