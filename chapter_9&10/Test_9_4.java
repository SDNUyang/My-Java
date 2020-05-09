package ch9;
import java.util.*;

public class Test_9_4 {
    public static void main(String[] args){
        Random random1=new Random(1000);
        for(int i=0;i<50;i++){
            System.out.print(random1.nextInt(100)+" ");
        }

    }
}
