package package_2;

public class String_Practice_2 {
    public static void main(String[] args){
        String name1="Gao Yang";
        int k=name1.indexOf(' ');
        String firstname=name1.substring(0,k);
        String lastname=name1.substring(k+1, name1.length());
        System.out.println("The firstname of Name1 is "+firstname);
        System.out.println("The lastname of Name1 is "+lastname);
    }
}
