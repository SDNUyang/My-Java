package M3_D16;

public class Sum_of_numbers {
    public static void main(String[] args){
        double Molecule=1.0;
        double Deno=3.0;
        double sum=Molecule/Deno;
        for(int i=1;i<(99+3)/2;i++){
            Molecule+=2*i;
            Deno+=2*i;
            sum+=Molecule/Deno;
        }
        System.out.println(sum);
    }
}
