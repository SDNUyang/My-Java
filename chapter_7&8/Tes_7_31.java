import java.util.Scanner;
public class Tes_7_31 {
    /*main方法*/
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the index number of list1:");
        int number1=input.nextInt();
        System.out.println();
        int[] list1=new int[number1];
        System.out.print("Enter List1:");
        for (int i=0;i<list1.length;i++){
            list1[i]=input.nextInt();
            //System.out.print(" ");
        }
        System.out.print("Enter the index number of list2:");
        int number2=input.nextInt();
        System.out.println();
        int[] list2=new int[number2];
        System.out.print("Enter List2:");
        for (int i=0;i<list2.length;i++){
            list2[i]=input.nextInt();
            //System.out.print(" ");
        }
        int[] list3=new int[list1.length+list2.length];
        list3=merge(list1,list2);
        System.out.print("The merge list is:");
     for (int i=0;i<list1.length+list2.length;i++){
        System.out.print(list3[i]+" ");
    }
    }

    /*合并有序列表,这里的想法是先将两个数组合并为一个数组，然后进行排序*/
    public static int[] merge(int[] list1,int[] list2){
        int[] list3=new  int[list1.length+list2.length];
        int listlength=list1.length+list2.length;
        /*次循环用来读进list1中的数据*/
        for (int i=0;i<list1.length;i++){
            list3[i]=list1[i];
        }
        /*次循环用来读入list2中的数据*/
        for (int i=list1.length;i<listlength;i++){
            list3[i]=list2[i-list1.length];
        }
        /*选择排序对合并后的数组进行排序*/
        for (int i=0;i<listlength-1;i++){
            int currentMin=list3[i];
            int currentMinIndex=i;
            for (int j=i+1;j<listlength;j++){
                if (currentMin>list3[j]){
                    currentMin=list3[j];
                    currentMinIndex=j;
                }
            }
            if (currentMinIndex!=i){
                list3[currentMinIndex]=list3[i];
                list3[i]=currentMin;
            }
        }
        return list3;
    }
}
