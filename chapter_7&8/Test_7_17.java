import java.util.Scanner;
public class Test_7_17 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入学生的个数：");
        int number=input.nextInt();
        Student[] S=new Student[number];
        /*循环初始化*/
        for (int i=0;i<number;i++){
            System.out.print("请输入学生"+(i+1)+"的姓名：");
            String sname=input.next();
            System.out.print("请输入学生"+(i+1)+"的成绩：");
            double sscore=input.nextDouble();
            S[i]=new Student(sname,sscore);
        }
        /*循环比较大小并输出*/
        double max=S[0].retscore();
        for (int j=0;j<number;j++){
            for (int k=0;k<number;k++){
                if(S[k].retscore()>max)
                    max=S[k].retscore();
            }
            int n;
            for (n=1;n<number;n++){
                if(S[number-1].retscore()==max){
                    System.out.println(S[number-1].retname());
                }
                else if(S[n].retscore()==max)
                    S[n].changescore(S[n-1].retscore());
            }
            System.out.println(S[n-1].retname());
        }
        System.out.println();
    }
}
 class Student{
    /*私有数据成员姓名和分数*/
        private String name;
        private double score;
        /*构造函数*/
     Student()
     {
         System.out.print("无参构造函数被调用");
     }
     Student(String a,double b)
     {
         name=a;
         score=b;
     }
     /*接口*/
     String retname()
     {
         return name;
     }
     double retscore()
     {
         return score;
     }
     void changescore(double bb)
     {
         score=bb;
     }
}
