package Package_1;

public class practice {
    public static void main(String[] args)
    {
        //通过强制类型转换来输出字符的Ascii值
       /* System.out.println("The ASCLL of '1' is "+(int)'1');
        System.out.println("The ASCLL of 'A' is "+(int)'A');
        System.out.println("The ASCLL of 'B' is "+(int)'B');
        System.out.println("The ASCLL of 'a' is "+(int)'a');
        System.out.println("The ASCLL of 'b' is "+(int)'b');
        System.out.println("\\\\is la \"");
        int i='1';
        System.out.println(i);
       */
       char c='A';
       int i=(int)c;
       System.out.println(i);
       float f=1000.34f;
       int n=(int)f;
       System.out.println(n);
       int l=100;
       char r=(char)l;
       System.out.println(r);
    }
}
