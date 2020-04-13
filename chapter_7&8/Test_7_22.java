import java.math.*;
import java.util.Random;

public class Test_7_22 {
    public static void main(String[] args) {
        /*八皇后问题*/
        //int a =(int)(Math.random()*8);
        //System.out.println("---"+a);
        char [][] tdarray=new char[8][8];
        int []rememberrow=new int[8];//用来记住每一个皇后的行号
        int []remembercolum=new int[8];//用来记住每一个皇后的列号
        remembercolum[0]=0;
        rememberrow[0]=0;
        tdarray[0][0]='Q';
        int counts=0;
     for(int row=1;row<8;row++){
         int rcolum=1;
         for(int colum=1;colum<8;colum++){
             boolean judge=true;//判断标志，如果之前的行号有重复，则judge=false
            do {
                remembercolum[colum]=(int)(Math.random()*8);
                /*遍历一遍是否以前是否有重列的*/
                /*
                for(int k=0;k<colum;k++){
                    if (remembercolum[colum]==remembercolum[k])
                        judge=false;
                }
                */
            }while(remembercolum[colum]==remembercolum[colum-1]);
         }
         System.out.println("***"+remembercolum[rcolum]+"+"+counts);
         tdarray[row][remembercolum[rcolum]]='Q';
         rcolum++;
         counts++;
     }
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print(tdarray[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
