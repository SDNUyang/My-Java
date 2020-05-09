package ch9;
import java.util.Scanner;
public class TestLocation {
    /*测试主调*/
    public static void main(String[] args){
        /**首先让用户输入一个二维数组*/
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of rows and colums:");
        int rows=input.nextInt();
        int colums=input.nextInt();
        double[][] twoDArray=new double[rows][colums];
        System.out.println("Enter the arrays:");
        for (int i=0;i<rows;i++){
            for (int j=0;j<colums;j++){
                double elements=input.nextDouble();
                twoDArray[i][j]=elements;
            }
            System.out.println();
        }
        System.out.println(twoDArray.length);

        /**调用所写的方法*/
        Location location=new Location();
        location=locateLargest(twoDArray);

        /**显示*/
        System.out.print("The largest element is "+location.getMaxValue()+" at ("+location.getRow()+","+location.getColum()+")");

    }
    /*该方法返回二维数组最大值的位置*/
    public static Location locateLargest(double[][] a){
        Location location=new Location();
        double largestElement=0;
        int row=0;
        int colum=0;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if(a[i][j]>=largestElement){
                    largestElement=a[i][j];
                    row=i;
                    colum=j;
                }
            }
        }
        location.changeRow(row);
        location.changeColum(colum);
        location.changeMaxValue(largestElement);
        return location;
    }
}
