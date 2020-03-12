package package_3;
import java.util.Scanner;
public class TO10 {
    public static void main(String[] args){
        /*用户输入十六进制数字，程序给出对应的十进制结果*/
        Scanner input=new Scanner(System.in);
        System.out.print("转化前的十六进制数：");
        String Number=input.nextLine();
        int length=Number.length();//获取输入十六进制数的长度
        // System.out.println(length);
        int num=0;
        double i=0;//

             for (; (length - 1) >= 0; length--) {
                char ch = Number.charAt(length - 1);
                double len_1=0.0;
                if (ch == '0') {
                    len_1 = 0 * Math.pow(16, i);
                    //num += len_1;
                }
                if (ch == '1') {
                    len_1 = 1 * Math.pow(16, i);
                   // num += len_1;
                }
                if (ch == '2') {
                    len_1 = 2 * Math.pow(16, i);
                    //num += len_1;
                }
                if (ch == '3') {
                    len_1 = 3 * Math.pow(16, i);
                }
                if (ch == '4') {
                    len_1 = 4 * Math.pow(16, i);
                    //num += len_1;
                }
                if (ch == '5') {
                    len_1 = 5 * Math.pow(16, i);
                    //num += len_1;
                }
                if (ch == '6') {
                    len_1 = 6 * Math.pow(16, i);
                    //num += len_1;
                }
                if (ch == '7') {
                    len_1 = 7 * Math.pow(16, i);
                    //num += len_1;
                }
                if (ch == '8') {
                    len_1 = 8 * Math.pow(16, i);
                   // num += len_1;
                }
                if (ch == '9') {
                    len_1 = 9 * Math.pow(16, i);
                   // num += len_1;
                }
                if (ch == 'A') {
                    len_1 = 10 * Math.pow(16, i);
                   // num += len_1;
                }
                if (ch == 'B') {
                    len_1 = 11 * Math.pow(16, i);
                    //num += len_1;
                }
                if (ch == 'C') {
                    len_1 = 12 * Math.pow(16, i);
                    //num += len_1;
                }
                if (ch == 'D') {
                    len_1 = 13 * Math.pow(16, i);
                   // num += len_1;
                }
                if (ch == 'E') {
                    len_1 = 14 * Math.pow(16, i);
                   // num += len_1;
                }
                if (ch == 'F') {
                    len_1 = 15 * Math.pow(16, i);
                    //num += len_1;
                }
                 num += len_1;
                 i++;
            }
        System.out.println("转换后的十进制数："+num);

    }
}
