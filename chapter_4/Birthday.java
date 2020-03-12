package package_3;
import java.util.Scanner;
public class Birthday {
    public static void main(String[] args){

            //5Set
            String Set1="1 3 5 7 \n"+"9 11 13 15 \n"+"17 19 21 23 \n"+"25 27 29 31 \n";
            String Set2="2 3 6 7 \n"+"10 11 14 15 \n"+"18 19 22 23 \n"+"26 27 30 31 \n";
            String Set3="4 5 6 7 \n"+"12 13 14 15 \n"+"20 21 22 23 \n"+"28 29 30 31 \n";
            String Set4="8 9 10 11 \n"+"12 13 14 15 \n"+"24 25 26 27 \n"+"28 29 30 31 \n";
            String Set5="16 17 18 19 \n"+"20 21 22 23 \n"+"24 25 26 27 \n"+"28 29 30 31 \n";
            int day=0;
            //Creat Scanner
            Scanner input=new Scanner(System.in);
            System.out.println("Is your birthday in Set1?");
            System.out.println(Set1);
            System.out.println("Enter 1 if yes and 0 if no");
            int Answer1=input.nextInt();
            if(Answer1==1)
                day+=1;
            System.out.println("Is your birthday in Set2?");
            System.out.println(Set2);
            System.out.println("Enter 1 if yes and 0 if no");
            int Answer2=input.nextInt();
            if(Answer2==1)
                day+=2;
            System.out.println("Is your birthday in Set3?");
            System.out.println(Set3);
            System.out.println("Enter 1 if yes and 0 if no");
            int Answer3=input.nextInt();
            if(Answer3==1)
                day+=4;
            System.out.println("Is your birthday in Set4?");
            System.out.println(Set4);
            System.out.println("Enter 1 if yes and 0 if no");
            int Answer4=input.nextInt();
            if(Answer4==1)
                day+=8;
            System.out.println("Is your birthday in Set5?");
            System.out.println(Set5);
            System.out.println("Enter 1 if yes and 0 if no");
            int Answer5=input.nextInt();
            if(Answer5==1)
                day+=16;
            System.out.println("Your birthday is "+day);


    }
}
