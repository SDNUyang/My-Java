package ch10;

public class MyInteger {
    private int value=0;

    public MyInteger(int a){
        this.value=a;
    }
    public MyInteger(){}
    public int get(){
        return value;
    }

    /**判断奇数偶数素数的非静态方法*/
    public boolean isEven(){
        if(this.value%2==0)
            return true;
        else return false;
    }
    public boolean isOdd(){
        if(this.value%2!=0)
            return true;
            else return false;
    }
    public boolean isPrime(){
        int sum=0;
        int total=this.value;
        for(int i=2;i<total;i++){
            if(this.value%i==0)
                sum++;
        }
        if(sum==0)
            return true;
        else return false;
    }

    /**判断奇数偶数素数的静态方法-1*/
    public static boolean isEven(int value){
        if(value%2==0)
            return true;
        else return false;
    }
    public static boolean isOdd(int value){
        if(value%2!=0)
            return true;
        else return false;
    }
    public static boolean isPrime(int value){
        int sum=0;
        int total=value;
        for(int i=2;i<total;i++){
            if(value%i==0)
                sum++;
        }
        if(sum==0)
            return true;
        else return false;
    }

    /**判断奇数偶数素数的静态方法-2*/
    public static boolean isEven(MyInteger v){
        if(v.value%2==0)
            return true;
        else return false;
    }
    public static boolean isOdd(MyInteger v){
        if(v.value%2!=0)
            return true;
        else return false;
    }
    public static boolean isPrime(MyInteger v){
        int sum=0;
        int total=v.value;
        for(int i=2;i<total;i++){
            if(v.value%i==0)
                sum++;
        }
        if(sum==0)
            return true;
        else return false;
    }

    /**判断是否相等*/
    public boolean equals(int value){
        if(this.value==value)
            return true;
        else return false;
    }
    public boolean equals(MyInteger v){
        if(this.value==v.value)
            return true;
        else return false;
    }

    /**数值类型转换*/
    public static int parseInt(char[] a){
        int Int=0;
        for(int i=a.length-1;i>=0;i--){
            Int+=a[i]*(int)(Math.pow(10,a.length-1-i));
        }
        return Int;
    }
    public static int parseInt(String a){
        int Int=0;
        char[] Ch=a.toCharArray();//将字符串转换成字符数组类型
        for(int i=Ch.length-1;i>=0;i--){
            Int+=Ch[i]*(int)(Math.pow(10,Ch.length-1-i));
        }
        return Int;
    }
}
