public class Tset_7_23 {
    public static void main(String[] args){
        /*创建一个大小100的布尔类型的数组，true表示开，false表示关闭*/
        boolean[] box=new boolean[100];
        /*执行的过程*/
        System.out.println("**********S1执行完后**********");
        for(int j=0;j<100;j++){
            box[j]=true;
        }
        disp(box);
        System.out.println("**********S2执行完后**********");
        for (int i=1;i<100;i+=2){
            box[i]=false;
        }
        disp(box);
        System.out.println("**********S3执行完后**********");
      comeInStudents(box,2);
        disp(box);
        System.out.println("......");
        System.out.println("......");
        System.out.println("......");
        System.out.println("**********S100执行完后**********");
        for (int i=3;i<100;i++){
            comeInStudents(box,i);
        }
        disp(box);
        int sum=1;//最少有一个柜子时开着的
        /*开着柜子的个数*/
        System.out.println("开着的柜子的编号为：");
        for (int i=0;i<100;i++){
            if (box[i]==true)
                System.out.print(i+" ");
                sum+=1;
        }
        //System.out.println("sum="+sum);
        /*
        int[] openBox=new int[sum];//用来记录开着的柜子的编号
        for (int j=0;j<sum;j++){
            for (int i=0;i<100;i++){
                if(box[i]==true)
                {
                    if(judge(openBox,i)==false)
                    {
                        openBox[j]=i;
                        System.out.print(i+"**");
                    }
                    break;
                }
                }
            }
        System.out.print("开着的柜子的编号为：");
        for (int i=0;i<sum;i++){
            System.out.print(openBox[i]+",");
        }

         */
    }

    /*用来显示当前柜子的开关情况*/
    public static void disp(boolean[] b){
        for (int j=0;j<10;j++){
            for(int k=0;k<10;k++){
                System.out.print(b[j*10+k]+" ");
            }
            System.out.println();
        }
    }

    /*学生往里进开关柜子的过程*/
    public static void comeInStudents(boolean[] a,int num){
        for (int j=num;j<100;j+=(num+1)){
            if(a[j]==true)
                a[j]=false;
            else
                a[j]=true;
        }
    }
    /*判断是否已经有了这个数*/
    public static boolean judge(int[] r,int number){
        boolean ju=true;
        for (int i=0;i<r.length;i++){
            if(r[i]==number)
                ju=false;
            else ju=true;
        }
        return ju;
    }

}
