package package_2;
import java.util.Scanner;

public class String_Practice {
    public static void main(String[] args) {
        /*
        String meesage = "I love Java";
        System.out.println("The Lentgh of  \"I love Java\" is "+meesage.length());//求字符窜的长度函数
        System.out.println("I love Java".length());//这样也可以

        //从字符串中提取字符 S.charAt(index) index取值范围在0-s.length()-1
        String s="Welcome to Java";
        System.out.println(s.charAt(s.length()-1));

        //链接字符串
        //String s3=meesage.concat(s);
        String s3=meesage+s;//以上两种方法都可以 concat方法 + 方法
        System.out.println("新字符串为"+s3);

        //转换字符串
        String s4="Welcome To Java ";
        System.out.println("Lower:"+s4.toLowerCase());//全变小写
        System.out.println("Upper:"+s4.toUpperCase());//全变大写
        char a='A';
        System.out.println("charcter to LowerCase('A'):"+Character.toLowerCase(a));
         */
        //从控制台中读取字符串
        Scanner input=new Scanner(System.in);
        System.out.println("Please input three Strings : ");
        String s1=input.next();
        String s2=input.next();
        String s3=input.next();//next（）已空白字符作为结束字符
        String s4=input.nextLine();//nextline（） 回车作为结束字符
        System.out.println("The first String is-"+s1);
        System.out.println("The second String is-"+s2);
        System.out.println("The threed String is-"+s3);
        System.out.println("The fouth String is-"+s4);
    }

}
