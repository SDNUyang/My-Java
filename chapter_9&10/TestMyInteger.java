package ch10;
import java.util.Scanner;
public class TestMyInteger {
    public static void main(String[] args){

        /**new 一个MyInteger对象并输出他的值*/
        System.out.println("/**new 一个MyInteger对象并输出他的值*/");
        MyInteger Int1=new MyInteger(15);
        System.out.println(Int1.get());

        /**非静态方法判断奇数偶数素数*/
        System.out.println("/**非静态方法判断奇数偶数素数*/");
        System.out.println(Int1.get()+" 是否为偶数："+Int1.isEven());
        System.out.println(Int1.get()+" 是否为奇数："+Int1.isOdd());
        System.out.println(Int1.get()+" 是否为素数："+Int1.isPrime());

        /**静态方法判断奇数偶数素数-1*/
        System.out.println("/**静态方法判断奇数偶数素数*/-1");
        MyInteger Int2=new MyInteger();
        System.out.println(" 是否为偶数："+Int2.isEven(2));
        System.out.println(" 是否为奇数："+Int2.isOdd(2));
        System.out.println(" 是否为素数："+Int2.isPrime(2));

        /**静态方法判断奇数偶数素数-2*/
        System.out.println("/**静态方法判断奇数偶数素数*/-2");
        MyInteger Int3=new MyInteger(45);
        System.out.println(Int3.get()+" 是否为偶数："+Int2.isEven(Int3));
        System.out.println(Int3.get()+" 是否为奇数："+Int2.isOdd(Int3));
        System.out.println(Int3.get()+" 是否为素数："+Int2.isPrime(Int3));

        /**判断是否相等*/
        MyInteger Int4=new MyInteger(69);
        MyInteger Int5=new MyInteger(100);
        System.out.println("/**判断是否相等*/");
        System.out.println(Int4.get()+" 是否与69相等 :"+Int4.equals(69));
        System.out.println(Int4.get()+" 是否与 "+Int5.get()+" 相等："+Int4.equals(Int5));

        /**数值类型转换*/
        char[] a=new char[3];
        a[0]='1';
        a[1]='3';
        a[2]='5';
        int k=MyInteger.parseInt(a);
        System.out.println(k);
        int p=MyInteger.parseInt("123");
        System.out.println(p);
    }
}
